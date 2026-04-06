package com.example.bfhl.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Component
public class AiClient {

    @Value("${openrouter.api.key}")
    private String apiKey;

    private final String URL = "https://openrouter.ai/api/v1/chat/completions";

    public String callAI(String prompt) {

        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer " + apiKey);

            Map<String, Object> body = new HashMap<>();
            body.put("model", "openai/gpt-3.5-turbo");

            List<Map<String, String>> messages = new ArrayList<>();

            Map<String, String> msg = new HashMap<>();
            msg.put("role", "user");
            msg.put("content", prompt);

            messages.add(msg);

            body.put("messages", messages);

            HttpEntity<Map<String, Object>> request = new HttpEntity<>(body, headers);

            Map response = restTemplate.postForObject(URL, request, Map.class);

            List choices = (List) response.get("choices");
            Map first = (Map) choices.get(0);
            Map message = (Map) first.get("message");

            return message.get("content").toString();

        } catch (Exception e) {
            return "AI service failed: " + e.getMessage();
        }
    }
}