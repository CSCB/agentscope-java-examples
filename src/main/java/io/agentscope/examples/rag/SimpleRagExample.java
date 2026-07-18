package io.agentscope.examples.rag;

import io.agentscope.core.embedding.EmbeddingModel;
import io.agentscope.core.embedding.dashscope.DashScopeTextEmbedding;
import io.agentscope.core.rag.knowledge.SimpleKnowledge;
import io.agentscope.core.rag.model.Document;
import io.agentscope.core.rag.model.RetrieveConfig;
import io.agentscope.core.rag.reader.ReaderInput;
import io.agentscope.core.rag.reader.SplitStrategy;
import io.agentscope.core.rag.reader.TextReader;
import io.agentscope.core.rag.store.InMemoryStore;
import io.agentscope.core.rag.store.VDBStoreBase;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/CSCB
 * Example 1: Simple RAG Demo - Load markdown files, retrieve, and print results.
 * Pure RAG pipeline without any Agent involvement.
 *
 * <p>How to run in IDEA: set environment variable DASHSCOPE_API_KEY=your_key,
 * then right-click and run the main method.
 */
public class SimpleRagExample {

    public static void main(String[] args) {
        // ---- 检查环境变量 ----
        String apiKey = System.getenv("DASHSCOPE_API_KEY");
        if (apiKey == null || apiKey.isBlank()) {
            System.err.println("错误: 未设置 DASHSCOPE_API_KEY 环境变量。");
            System.err.println("请从 https://dashscope.console.aliyun.com 获取 API Key");
            System.err.println("然后在 IDEA Run Configuration 中添加环境变量 DASHSCOPE_API_KEY=your_api_key");
            System.exit(1);
        }

        // ---- 打印标题 ----
        String title = "示例1：最简 RAG 演示 (Simple RAG Example)";
        String line = "=".repeat(60);
        System.out.println("\n" + line);
        System.out.println(title);
        System.out.println(line);
        System.out.println("演示流程: 加载知识文件 -> 文本分块 -> Embedding -> 向量检索\n");

        try {
            // ---- 1. 创建 Embedding 模型 ----
            System.out.println("[1/5] 创建 DashScope Embedding 模型 (text-embedding-v3, 1024维)...");
            EmbeddingModel embeddingModel = DashScopeTextEmbedding.builder()
                    .modelName("text-embedding-v3")
                    .dimensions(1024)
                    .apiKey(apiKey)
                    .build();

            // ---- 2. 创建内存向量存储 ----
            System.out.println("[2/5] 创建 InMemoryStore (1024维)...");
            VDBStoreBase store = InMemoryStore.builder().dimensions(1024).build();

            // ---- 3. 创建知识库 ----
            System.out.println("[3/5] 创建 SimpleKnowledge 知识库...");
            SimpleKnowledge knowledge = SimpleKnowledge.builder()
                    .embeddingModel(embeddingModel)
                    .embeddingStore(store)
                    .build();

            // ---- 4. 读取知识文件并添加到知识库 ----
            System.out.println("[4/5] 读取知识文件并分块...");

            TextReader textReader = new TextReader(512, SplitStrategy.PARAGRAPH, 50);

            String[] filePaths = {
                    "/knowledge/brand-overview.md",
                    "/knowledge/products.md"
            };

            List<Document> allDocs = new ArrayList<>();
            for (String filePath : filePaths) {
                String rawPath = SimpleRagExample.class.getResource(filePath).getFile();
                // 处理 URL 编码的中文路径，以及 Windows 下 /C:/ 开头的不合法路径
                String decodedPath = URLDecoder.decode(rawPath, StandardCharsets.UTF_8);
                if (decodedPath.startsWith("/") && decodedPath.length() > 2
                        && decodedPath.charAt(2) == ':') {
                    decodedPath = decodedPath.substring(1);
                }
                System.out.println("  读取文件: " + decodedPath);

                List<Document> docs = textReader.read(ReaderInput.fromFile(decodedPath)).block();
                if (docs != null && !docs.isEmpty()) {
                    allDocs.addAll(docs);
                    System.out.println("    -> 分块数量: " + docs.size());
                }
            }

            System.out.println("  总文档块数: " + allDocs.size());
            System.out.println("  正在生成 Embedding 并写入向量库...");
            knowledge.addDocuments(allDocs).block();
            System.out.println("  知识库加载完成!");

            // ---- 5. 检索测试 ----
            System.out.println("\n[5/5] 开始检索测试...\n");

            // 检索问题1
            String query1 = "醉驾怎么处罚？";
            printRetrieveResult(knowledge, query1, 3, 0.3);

            // 检索问题2
            String query2 = "超速 50% 以上扣几分？";
            printRetrieveResult(knowledge, query2, 3, 0.3);

            System.out.println(line);
            System.out.println("RAG 演示完成!");
            System.out.println(line);

        } catch (Exception e) {
            System.err.println("发生错误: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void printRetrieveResult(SimpleKnowledge knowledge, String query,
                                            int limit, double threshold) {
        String separator = "-".repeat(60);
        System.out.println(separator);
        System.out.println("查询: \"" + query + "\"");
        System.out.println("  检索参数: limit=" + limit + ", scoreThreshold=" + threshold);
        System.out.println(separator);

        List<Document> results = knowledge.retrieve(query,
                RetrieveConfig.builder().limit(limit).scoreThreshold(threshold).build()
        ).block();

        if (results == null || results.isEmpty()) {
            System.out.println("  (未检索到匹配结果)\n");
            return;
        }

        for (int i = 0; i < results.size(); i++) {
            Document result = results.get(i);
            System.out.println("  [结果 " + (i + 1) + "]  相似度分数: " + String.format("%.4f", result.getScore()));
            System.out.println("  " + "-".repeat(50));
            String content = result.getMetadata().getContentText();
            // 截断过长的内容用于展示
            if (content.length() > 300) {
                content = content.substring(0, 300) + "...";
            }
            System.out.println("  " + content.replace("\n", "\n  "));
            System.out.println();
        }
    }
}