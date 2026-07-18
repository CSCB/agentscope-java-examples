/*
 * Copyright 2024/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2./*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.ag/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.<//*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(Re/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: "/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " +/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review:/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.get/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.getStructuredData(SentimentAnalysis.class);

            System.out.println("Sentiment analysis results:");
            System.out.println("  Overall Sentiment: " + result.overallSentiment);
            System.out.println/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.getStructuredData(SentimentAnalysis.class);

            System.out.println("Sentiment analysis results:");
            System.out.println("  Overall Sentiment: " + result.overallSentiment);
            System.out.println("  Positive Score: " + result.positiveScore);
            System.out.println("  Negative Score: " + result.negativeScore);
            System/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.getStructuredData(SentimentAnalysis.class);

            System.out.println("Sentiment analysis results:");
            System.out.println("  Overall Sentiment: " + result.overallSentiment);
            System.out.println("  Positive Score: " + result.positiveScore);
            System.out.println("  Negative Score: " + result.negativeScore);
            System.out.println("  Neutral Score: " + result.neutralScore);
            System.out.println("  Key Topics: " + result.keyTopics);
            System.out.println("  Summary: " + result/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.getStructuredData(SentimentAnalysis.class);

            System.out.println("Sentiment analysis results:");
            System.out.println("  Overall Sentiment: " + result.overallSentiment);
            System.out.println("  Positive Score: " + result.positiveScore);
            System.out.println("  Negative Score: " + result.negativeScore);
            System.out.println("  Neutral Score: " + result.neutralScore);
            System.out.println("  Key Topics: " + result.keyTopics);
            System.out.println("  Summary: " + result.summary);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runStreamProductAnalysisExample(/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.getStructuredData(SentimentAnalysis.class);

            System.out.println("Sentiment analysis results:");
            System.out.println("  Overall Sentiment: " + result.overallSentiment);
            System.out.println("  Positive Score: " + result.positiveScore);
            System.out.println("  Negative Score: " + result.negativeScore);
            System.out.println("  Neutral Score: " + result.neutralScore);
            System.out.println("  Key Topics: " + result.keyTopics);
            System.out.println("  Summary: " + result.summary);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runStreamProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.getStructuredData(SentimentAnalysis.class);

            System.out.println("Sentiment analysis results:");
            System.out.println("  Overall Sentiment: " + result.overallSentiment);
            System.out.println("  Positive Score: " + result.positiveScore);
            System.out.println("  Negative Score: " + result.negativeScore);
            System.out.println("  Neutral Score: " + result.neutralScore);
            System.out.println("  Key Topics: " + result.keyTopics);
            System.out.println("  Summary: " + result.summary);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runStreamProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System/*
 * Copyright 2024-2026 the original author or authors.
 *
 * @author https://github.com/CSCB
 * @author wdh (https://github.com/CSCB)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.agentscope.examples.wdh.structuredoutput;

import io.agentscope.core.ReActAgent;
import io.agentscope.core.agent.Event;
import io.agentscope.core.agent.StreamOptions;
import io.agentscope.core.message.Msg;
import io.agentscope.core.message.UserMessage;
import io.agentscope.core.tool.Toolkit;
import io.agentscope.extensions.model.dashscope.DashScopeChatModel;
import io.agentscope.extensions.model.dashscope.formatter.DashScopeChatFormatter;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * StructuredOutputExample - Demonstrates structured output generation.
 *
 * <p>Migration notes:
 * <ul>
 *   <li>Removed {@code .memory(new InMemoryMemory())} — not required in 2.0.</li>
 * </ul>
 */
public class StructuredOutputExample {

    /**
     * Runs the structured output example.
     *
     * @param args command-line arguments (ignored)
     * @throws Exception if an I/O error occurs
     */
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Structured Output Example");
        System.out.println("=".repeat(60));
        System.out.println(
                "This example demonstrates how to generate structured output from agents.\n"
                        + "The agent will analyze user queries and return structured data.");
        System.out.println("=".repeat(60) + "\n");

        String apiKey = System.getenv("DASHSCOPE_API_KEY");

        ReActAgent agent =
                ReActAgent.builder()
                        .name("AnalysisAgent")
                        .sysPrompt(
                                "You are an intelligent analysis assistant. "
                                        + "Analyze user requests and provide structured responses.")
                        .model(
                                DashScopeChatModel.builder()
                                        .apiKey(apiKey)
                                        .modelName("qwen-max")
                                        .stream(true)
                                        .enableThinking(false)
                                        .formatter(new DashScopeChatFormatter())
                                        .build())
                        .toolkit(new Toolkit())
                        .build();

        System.out.println("=== Example 1: Product Information ===\n");
        runProductAnalysisExample(agent);

        System.out.println("\n=== Example 2: Contact Information ===\n");
        runContactExtractionExample(agent);

        System.out.println("\n=== Example 3: Sentiment Analysis ===\n");
        runSentimentAnalysisExample(agent);

        System.out.println("\n=== Example 4: Streaming Structured Output ===\n");
        runStreamProductAnalysisExample(agent);

        System.out.println("\n=== All examples completed ===");
    }

    private static void runProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Msg msg = agent.call(userMsg, ProductRequirements.class).block();
            ProductRequirements result = msg.getStructuredData(ProductRequirements.class);

            System.out.println("Extracted structured data:");
            System.out.println("  Product Type: " + result.productType);
            System.out.println("  Brand: " + result.brand);
            System.out.println("  Min RAM: " + result.minRam + " GB");
            System.out.println("  Max Budget: $" + result.maxBudget);
            System.out.println("  Features: " + result.features);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runContactExtractionExample(ReActAgent agent) {
        String query =
                "Please contact John Smith at john.smith@example.com or "
                        + "call him at +1-555-123-4567. His company is TechCorp Inc.";

        System.out.println("Text: " + query);
        System.out.println("\nExtracting contact information...\n");

        Msg userMsg = new UserMessage("Extract contact information from: " + query);

        try {
            Msg msg = agent.call(userMsg, ContactInfo.class).block();
            ContactInfo result = msg.getStructuredData(ContactInfo.class);

            System.out.println("Extracted contact information:");
            System.out.println("  Name: " + result.name);
            System.out.println("  Email: " + result.email);
            System.out.println("  Phone: " + result.phone);
            System.out.println("  Company: " + result.company);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runSentimentAnalysisExample(ReActAgent agent) {
        String review =
                "This product exceeded my expectations! The quality is amazing "
                        + "and the customer service was very helpful. However, "
                        + "the shipping took a bit longer than expected.";

        System.out.println("Review: " + review);
        System.out.println("\nAnalyzing sentiment...\n");

        Msg userMsg =
                new UserMessage(
                        "Analyze the sentiment of this review and provide scores: " + review);

        try {
            Msg msg = agent.call(userMsg, SentimentAnalysis.class).block();
            SentimentAnalysis result = msg.getStructuredData(SentimentAnalysis.class);

            System.out.println("Sentiment analysis results:");
            System.out.println("  Overall Sentiment: " + result.overallSentiment);
            System.out.println("  Positive Score: " + result.positiveScore);
            System.out.println("  Negative Score: " + result.negativeScore);
            System.out.println("  Neutral Score: " + result.neutralScore);
            System.out.println("  Key Topics: " + result.keyTopics);
            System.out.println("  Summary: " + result.summary);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void runStreamProductAnalysisExample(ReActAgent agent) {
        String query =
                "I'm looking for a laptop. I need at least 16GB RAM, "
                        + "prefer Apple brand, and my budget is around $2000. "
                        + "It should be lightweight for travel.";

        System.out.println("Query: " + query);
        System.out.println("\nRequesting structured output via stream...\n");

        Msg userMsg = new UserMessage("Extract the product requirements from this query: " + query);

        try {
            Flux<Event