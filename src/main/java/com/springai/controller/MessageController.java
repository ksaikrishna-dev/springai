package com.springai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prompt")
public class MessageController {

    @Autowired(required = true)
    ChatClient chatClient;

    @GetMapping("/hello")
    public String testAiPrompt() {
        String str = "Hello! What is Spring Boot?";
//        return str;
        return chatClient.prompt(str).call().content();
    }
}
