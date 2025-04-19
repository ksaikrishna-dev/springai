package com.springai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaiApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(ChatClient.Builder builder) {
//		return args -> {
//			ChatClient chatClient = builder.build();
//			String response = chatClient.prompt("Tell me a joke").call().content();
//			System.out.println(response);
//		};
//	}

	@Bean
	public ChatClient chatClient(ChatClient.Builder builder) {
		return builder.build();
	}
}
