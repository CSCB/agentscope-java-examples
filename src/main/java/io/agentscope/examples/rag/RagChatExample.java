package io.agentscope.examples.rag;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.embedding.EmbeddingModel;
import io.agentscope.core.embedding.dashscope.DashScopeTextEmbedding;
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
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author https://github.com/CSCB
 * Example 2: RAG + Agent Chat - Agent answers user questions using a knowledge base.
 * Before each turn, the knowledge base is retrieved and the results are
 * concatenated into the user message as context.
 *
 * <p>How to run in IDEA: set environment variable DASHSCOPE_API_KEY=your_key,
 * then right-click and run the main method.
 */
public class RagChatExample {

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
        String title = "示例2：RAG + Agent 对话 (RAG Chat Example)";
        String line = "=".repeat(60);
        System.out.println("\n" + line);
        System.out.println(title);
        System.out.println(line);
        System.out.println("演示流程: 加载知识库 -> 每次对话前检索 -> 上下文拼接到消息 -> Agent 回答");
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
            String rawPath = RagChatExample.class.getResource(filePath).getFile();
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

        // ---- 4. 创建 ReActAgent ----
        System.out.println("[初始化] 创建 ReActAgent (qwen-plus)...");
        ReActAgent agent = ReActAgent.builder()
                .name("TrafficLawAssistant")
                .sysPrompt("你是一个交通违法咨询助手，请根据检索到的知识库内容回答用户问题。"
                        + "如果知识库中没有相关信息，请如实告知。")
                .model(DashScopeChatModel.builder()
                        .apiKey(apiKey)
                        .modelName("qwen-plus")
                        .stream(true)
                        .formatter(new DashScopeChatFormatter())
                        .build())
                .toolkit(new Toolkit())
                .build();

        System.out.println(line);
        System.out.println("对话开始! 输入 'exit' 退出。\n");

        // ---- 5. 交互式对话循环 ----
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

            String query = input.trim();

            // 检索相关文档
            List<Document> results = knowledge.retrieve(query,
                    RetrieveConfig.builder().limit(5).scoreThreshold(0.3).build()
            ).block();

            // 拼接上下文
            String context;
            if (results == null || results.isEmpty()) {
                context = "（未检索到相关知识库内容）";
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < results.size(); i++) {
                    sb.append("[").append(i + 1).append("] ");
                    sb.append(results.get(i).getMetadata().getContentText());
                    sb.append("\n\n");
                }
                context = sb.toString().trim();
            }

            System.out.println("  [检索到 " + (results != null ? results.size() : 0) + " 条相关文档]");

            // 将上下文拼接到用户消息中
            String messageWithContext = "【参考资料】\n" + context + "\n\n【用户问题】\n" + query;

            // 调用 Agent
            Msg userMsg = new UserMessage(messageWithContext);
            System.out.print("Assistant: ");
            Msg reply = agent.call(userMsg).block();
            System.out.println(reply.getContent());
            System.out.println();
        }
    }
}