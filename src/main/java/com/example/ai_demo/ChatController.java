package com.example.ai_demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final OllamaService ollamaService;
    private final List<String> conversation = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("conversation", conversation);
        return "chat";
    }

    @PostMapping("/chat")
    public String chat(@RequestParam String userMessage, Model model) {
        conversation.add("🧑 You: " + userMessage);
        String aiResponse = ollamaService.askOllama(userMessage);
        conversation.add("🤖 Ollama: " + aiResponse);
        model.addAttribute("conversation", conversation);
        return "chat";
    }
}

