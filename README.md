# AgentScope Java Examples

All-in-one project integrating [agentscope-java](https://github.com/agentscope-ai/agentscope-java) official examples into a single IDEA-runnable Maven project.

## Requirements

- **JDK 17+**
- **Maven 3.6+**
- **DashScope API Key** - Get one at [https://dashscope.console.aliyun.com/apiKey](https://dashscope.console.aliyun.com/apiKey)
- **Node.js** (only for McpStdioExample) - `npm install -g @modelcontextprotocol/server-filesystem`

## Quick Start

1. Open this folder in IntelliJ IDEA
2. Wait for Maven dependency resolution to complete
3. Set `DASHSCOPE_API_KEY` in Run Configuration:
   - **Run > Edit Configurations...** > select a class
   - Click **Modify options** > check **Environment variables**
   - Enter `DASHSCOPE_API_KEY=sk-your-api-key`
   - Apply to all configurations via **Edit configuration templates... > Application > Environment variables**
4. Right-click any `main` method and run

## Project Structure

```
src/main/java/io/agentscope/examples/
├── quickstart/
│   └── BasicChatExample.java          Basic streaming chat with ReActAgent
├── tool/
│   ├── ToolCallingExample.java        @Tool annotation for agent tool calling
│   ├── ToolGroupExample.java          Autonomous tool group management (meta-tool)
│   └── ToolBaseExample.java           Custom ToolBase with permission control
├── structuredoutput/
│   └── StructuredOutputExample.java   Type-safe structured output extraction
├── mcp/
│   └── McpStdioExample.java           MCP protocol integration (Stdio transport)
├── hitl/
│   └── InterruptionExample.java       User-initiated agent interruption
├── streaming/
│   ├── StreamingConsoleExample.java   Console streaming output
│   ├── AgentEventStreamExample.java   Agent lifecycle event monitoring
│   └── StreamingWebExample.java       Spring Boot SSE streaming web API
├── state/
│   └── StateExample.java              Persistent conversation sessions
└── rag/
    ├── SimpleRagExample.java          Pure RAG: embed, index, retrieve (no agent)
    ├── RagChatExample.java             RAG + Agent: retrieve before each turn
    └── RagWithToolExample.java        RAG as Agent tool: agent decides when to search

src/main/resources/knowledge/
├── brand-overview.md                  Traffic law overview (RAG knowledge base)
└── products.md                        Traffic violation penalties (RAG knowledge base)
```

## Examples Overview

| Example | Category | Description | Interactive |
|---------|----------|-------------|:-----------:|
| **BasicChatExample** | Quick Start | Simplest streaming chat with ReActAgent | Yes |
| **ToolCallingExample** | Tool | Agent equipped with time, calculator, search tools | Yes |
| **ToolGroupExample** | Tool | Agent autonomously activates tool groups via meta-tool | Yes |
| **ToolBaseExample** | Tool | Custom ToolBase with permission control (confirmation on unsafe paths) | Yes |
| **StructuredOutputExample** | Output | Extract typed POJOs from natural language (product info, contact, sentiment) | No (auto-demo) |
| **McpStdioExample** | MCP | Connect to external MCP filesystem server via stdio | Yes |
| **InterruptionExample** | HITL | Interrupt long-running agent tasks with graceful recovery | No (auto-demo) |
| **StreamingConsoleExample** | Streaming | Real-time token-by-token console output | Yes |
| **AgentEventStreamExample** | Streaming | Full lifecycle event monitoring (AGENT_START, TOOL_CALL, TEXT_BLOCK, etc.) | No (auto-demo) |
| **StreamingWebExample** | Streaming | Spring Boot SSE streaming web API on port 8080 | HTTP API |
| **StateExample** | State | Persistent conversation sessions with save/resume | Yes |
| **SimpleRagExample** | RAG | Pure RAG pipeline: embed documents, vector search, print results | No (auto-demo) |
| **RagChatExample** | RAG | RAG + Agent: retrieve knowledge base before each conversation turn | Yes |
| **RagWithToolExample** | RAG | RAG as Agent tool: agent autonomously decides when to search | Yes |

## RAG Knowledge Base

The `rag/` examples use a traffic law knowledge base containing:

- **brand-overview.md** - Traffic law overview, penalty principles, point system, payment methods, appeal process
- **products.md** - 12 categories of traffic violations with specific penalty details (speeding, drunk driving, illegal parking, license plate violations, etc.)

### RAG Architecture

```
Three approaches to integrate RAG with Agent:

SimpleRagExample      RagChatExample          RagWithToolExample
┌──────────────┐    ┌───────────────────┐    ┌──────────────────────┐
│  Embed      │    │  Embed           │    │  Embed             │
│  ↓          │    │  ↓               │    │  ↓                  │
│  Vector     │    │  Vector          │    │  Vector            │
│  Store      │    │  Store           │    │  Store             │
│  ↓          │    │  ↓               │    │  ↓                  │
│  Retrieve   │    │  Retrieve/turn   │    │  @Tool             │
│  ↓          │    │  ↓               │    │  search_knowledge  │
│  Print      │    │  Concat context  │    │  _base             │
│  results    │    │  ↓               │    │  ↓                  │
└──────────────┘    │  Agent.call()    │    │  Agent.streamEvents()│
                    └───────────────────┘    └──────────────────────┘
                    (Always retrieve)       (Agent decides)
```

## StreamingWebExample Usage

After starting, open browser or use curl:

```bash
curl -N "http://localhost:8080/chat?message=Hello"
curl -N "http://localhost:8080/chat?message=What%20is%20AI?&sessionId=my-session"
```

## McpStdioExample Prerequisites

```bash
npm install -g @modelcontextprotocol/server-filesystem
```

## Dependencies

Based on [agentscope-bom 2.0.0](https://central.sonatype.com/artifact/io.agentscope/agentscope-bom/2.0.0) from Maven Central.

| Module | Purpose |
|--------|---------|
| `agentscope-harness` | Core agent framework (ReActAgent, Toolkit, etc.) |
| `agentscope-extensions-model-dashscope` | DashScope (Qwen) model provider |
| `agentscope-extensions-model-openai` | OpenAI model provider |
| `agentscope-extensions-model-anthropic` | Anthropic (Claude) model provider |
| `agentscope-extensions-model-gemini` | Google Gemini model provider |
| `agentscope-extensions-rag-simple` | RAG: embedding, vector store, document readers |
| `spring-boot-starter-webflux` | Spring Boot reactive web (StreamingWebExample) |
| `slf4j-simple` | Console logging |

## Tech Stack

- **JDK**: 17
- **AgentScope**: 2.0.0
- **Spring Boot**: 4.0.4
- **Default Model**: DashScope qwen-plus
- **Embedding**: DashScope text-embedding-v3 (1024d)
- **Vector Store**: InMemoryStore (no external database needed)
- **Document Reader**: TextReader (markdown, plain text)
