package com.example.ai_demo;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatWebSocketHandler extends TextWebSocketHandler {

    private final OllamaService ollamaService;

    public ChatWebSocketHandler(OllamaService ollamaService) {
        this.ollamaService = ollamaService;
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String userMessage = message.getPayload();
        String response = ollamaService.askOllama(userMessage);
        session.sendMessage(new TextMessage(response));
    }
}

