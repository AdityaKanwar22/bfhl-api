package com.example.bfhl.controller;

import com.example.bfhl.dto.BfhlResponse;
import com.example.bfhl.service.BfhlService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class BfhlController {

    private final BfhlService service;

    public BfhlController(BfhlService service) {
        this.service = service;
    }

    // ==============================
    // GET /bfhl (For Browser Testing)
    // ==============================
    @GetMapping("/bfhl")
    public String test() {
        return "BFHL API is running successfully 🚀";
    }

    // ==============================
    // POST /bfhl (Main API)
    // ==============================
    @PostMapping("/bfhl")
    public BfhlResponse handle(@RequestBody Map<String, Object> request) {

        if (request.size() != 1) {
            throw new RuntimeException("Only one key allowed in request");
        }

        String key = request.keySet().iterator().next();
        Object value = request.get(key);

        Object result = service.process(key, value);

        return new BfhlResponse(
                true,
                "aditya1762.be23@chitkara.edu.in",
                result
        );
    }

    // ==============================
    // GET /health
    // ==============================
    @GetMapping("/health")
    public BfhlResponse health() {
        return new BfhlResponse(
                true,
                "aditya1762.be23@chitkara.edu.in",
                null
        );
    }
}
