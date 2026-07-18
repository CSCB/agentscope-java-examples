package io.agentscope.examples.rag;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.embedding.EmbeddingModel;
import io.agentscope.core.embedding.dashscope.DashScopeTextEmbedding;
import io.agentscope.core.event.TextBlockDeltaEvent;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.rag.knowledge.SimpleKnowledge;
import io.agentscope.core.rag.model.Document;
import io.agentscope.core.rag.model.RetrieveConfig;
import io.agentscope.core.rag.reader.ReaderInput;
import io.agentscope.core.rag.reader.SplitStrategy;
import io.agentscope.core.rag.reader.TextReader;
import io.agentscope.core.rag.store.InMemoryStore;
import io.agentscope.core.rag.store.VDBStoreBase;
import io.agentscope.core.tool.Tool;
import io.agentscope.core.tool.ToolParam;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 *  * @author https://github.com/CSCB
 * Example 3: RAG as an Agent Tool - Register the knowledge base as a tool the Agent can call.
 * The Agent autonomously decides when to retrieve from the knowledge base
 * through ReAct reasoning.
 *
 * <p>How to run in IDEA: set environment variable DASHSCOPE_API_KEY=your_key,
 * then right-click and run the main method.
 */
public class RagWithToolExample {

    public static void main(String[] args) throws Exception {
        // ---- 检查环境变量 ----
        String apiKey = System.getenv("DASHSCOPE_API_KEY");
        if (apiKey == null || apiKey.isBlank()) {
            System.err.println("错误: 未设置 DASHSCOPE_API_KEY 环境变量。");
            System.err.println("请从 https://dashscope.console.aliyun.com 获取 API Key");
            System.err.println("然后在 IDEA Run Configuration 中添加环境变量 DASHSCOPE_API_KEY=your_api_key");
            System.exit(1);
        }

        // ---- 打印标题 ----
        String title = "示例3：RAG 作为 Agent 工具 (RAG with Tool Example)";
        String line = "=".repeat(60);
        System.out.println("\n" + line);
        System.out.println(title);
        System.out.println(line);
        System.out.println("演示流程: 加载知识库 -> 注册为 @Tool -> Agent 自主决定何时检索");
        System.out.println("输入 'exit' 退出\n");

        // ---- 1. 创建 Embedding 模型 ----
        System.out.println("[初始化] 创建 DashScope Embedding 模型...");
        EmbeddingModel embeddingModel = DashScopeTextEmbedding.builder()
                .modelName("text-embedding-v3")
                .dimensions(1024)
                .apiKey(apiKey)
                .build();

        // ---- 2. 创建内存向量存储 & 知识库 ----
        System.out.println("[初始化] 创建知识库...");
        VDBStoreBase store = InMemoryStore.builder().dimensions(1024).build();
        SimpleKnowledge knowledge = SimpleKnowledge.builder()
                .embeddingModel(embeddingModel)
                .embeddingStore(store)
                .build();

        // ---- 3. 加载知识文件 ----
        System.out.println("[初始化] 加载知识文件...");
        TextReader textReader = new TextReader(512, SplitStrategy.PARAGRAPH, 50);

        String[] filePaths = {
                "/knowledge/brand-overview.md",
                "/knowledge/products.md"
        };

        List<Document> allDocs = new ArrayList<>();
        for (String filePath : filePaths) {
            String rawPath = RagWithToolExample.class.getResource(filePath).getFile();
                String decodedPath = URLDecoder.decode(rawPath, StandardCharsets.UTF_8);
                if (decodedPath.startsWith("/") && decodedPath.length() > 2
                        && decodedPath.charAt(2) == ':') {
                    decodedPath = decodedPath.substring(1);
                }
            System.out.println("  读取: " + decodedPath);
            List<Document> docs = textReader.read(ReaderInput.fromFile(decodedPath)).block();
            if (docs != null && !docs.isEmpty()) {
                allDocs.addAll(docs);
            }
        }

        knowledge.addDocuments(allDocs).block();
        System.out.println("  知识库加载完成，共 " + allDocs.size() + " 个文档块\n");

        // ---- 4. 创建知识库工具并注册到 Toolkit ----
        System.out.println("[初始化] 注册知识库工具...");
        KnowledgeTool knowledgeTool = new KnowledgeTool(knowledge);

        Toolkit toolkit = new Toolkit();
        toolkit.registerTool(knowledgeTool);

        System.out.println("  已注册工具: search_knowledge_base");

        // ---- 5. 创建 ReActAgent ----
        System.out.println("[初始化] 创建 ReActAgent (qwen-plus, 流式输出)...");
        ReActAgent agent = ReActAgent.builder()
                .name("TrafficLawToolAgent")
                .sysPrompt("你是一个交通违法咨询助手。你有一个 search_knowledge_base 工具可以搜索知识库。"
                        + "当用户问关于交通违法、处罚、记分、罚款等问题时，请先调用该工具检索相关信息，"
                        + "然后基于检索结果回答。如果工具返回为空，请如实告知用户知识库中没有找到相关信息。")
                .model(DashScopeChatModel.builder()
                        .apiKey(apiKey)
                        .modelName("qwen-plus")
                        .stream(true)
                        .formatter(new DashScopeChatFormatter())
                        .build())
                .toolkit(toolkit)
                .build();

        System.out.println(line);
        System.out.println("对话开始! 输入 'exit' 退出。\n");

        // ---- 6. 交互式流式对话循环 ----
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("You: ");
            String input = reader.readLine();

            if (input == null || input.trim().equalsIgnoreCase("exit")) {
                System.out.println("\n再见!");
                break;
            }
            if (input.isBlank()) {
                continue;
            }

            Msg userMsg = new UserMessage(input.trim());

            System.out.print("\nAssistant: ");
            agent.streamEvents(userMsg)
                    .doOnNext(event -> {
                        if (event instanceof TextBlockDeltaEvent e) {
                            System.out.print(e.getDelta());
                        }
                    })
                    .blockLast();
            System.out.println("\n");
        }
    }

    /**
     * 知识库检索工具 - 将 SimpleKnowledge 包装为 Agent 可调用的 @Tool。
     */
    public static class KnowledgeTool {

        private final SimpleKnowledge knowledge;

        public KnowledgeTool(SimpleKnowledge knowledge) {
            this.knowledge = knowledge;
        }

        @Tool(
                name = "search_knowledge_base",
                description = "搜索交通违法知识库，获取交通违法行为的处罚标准、记分规则、罚款金额等相关内容。"
                        + "当用户询问关于交通违法、处罚、记分、罚款、驾驶证等问题时调用此工具。"
        )
        public String searchKnowledgeBase(
                @ToolParam(
                        name = "query",
                        description = "搜索查询关键词，例如: '醉驾处罚', '超速扣分', '违法停车罚款' 等"
                ) String query
        ) {
            try {
                List<Document> results = knowledge.retrieve(query,
                        RetrieveConfig.builder()
                                .limit(5)
                                .scoreThreshold(0.3)
                                .build()
                ).block();

                if (results == null || results.isEmpty()) {
                    return "未在知识库中找到与 \"" + query + "\" 相关的信息。";
                }

                StringBuilder sb = new StringBuilder();
                sb.append("找到 ").append(results.size()).append(" 条相关信息:\n\n");
                for (int i = 0; i < results.size(); i++) {
                    Document result = results.get(i);
                    sb.append("[").append(i + 1).append("] (相似度: ")
                      .append(String.format("%.2f", result.getScore())).append(")\n");
                    sb.append(result.getMetadata().getContentText());
                    sb.append("\n\n");
                }
                return sb.toString().trim();

            } catch (Exception e) {
                return "检索知识库时发生错误: " + e.getMessage();
            }
        }
    }
}