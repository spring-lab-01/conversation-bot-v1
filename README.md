# Ollama Conversational App

A real-time conversational web app built with:

- **Spring Boot** (backend)
- **WebSockets** (token-by-token streaming)
- **Thymeleaf + Bootstrap** (responsive UI)
- **Ollama** (local LLM engine like `llama3` or `mistral`)

## Demo
![](ai-demo-spring.mp4)


## Features

- Real-time **token-by-token** AI response from Ollama
- Streamed **Markdown + Code block rendering**
- Clean, responsive UI with **avatars and typing indicator**
- 100% local and private – uses your Ollama model (e.g., `llama3`, `mistral`, etc.)

---

## Tech Stack

| Layer         | Technology               |
|---------------|--------------------------|
| Backend       | Spring Boot, WebSocket   |
| Frontend      | Thymeleaf, Bootstrap 5   |
| AI Engine     | Ollama (running locally) |
| Build Tool    | Maven                    |
| Java Version  | Java 21                  |

---

## Prerequisites

- Java 21
- [Ollama installed](https://ollama.com)
- Maven
- A running Ollama model (`ollama run llama3`)

---

## Getting Started

1. Clone this repository

```bash
git clone https://github.com/spring-lab-01/conversation-bot-v1.git
cd conversation-bot-v1
```

2. Run Ollama model
```bash
ollama run llama3
```

3. Run the Spring Boot app
```bash
mvnw spring-boot:run

```
4. Visit the app
   Open your browser at: http://localhost:8080


