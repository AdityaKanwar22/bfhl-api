package com.example.bfhl.controller;

import com.example.bfhl.dto.BfhlRequest;
import com.example.bfhl.dto.BfhlResponse;
import com.example.bfhl.service.BfhlService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BfhlController {

    private final BfhlService service;

    public BfhlController(BfhlService service) {
        this.service = service;
    }

    // ==============================
    // GET /bfhl (Browser test)
    // ==============================
    @GetMapping("/bfhl")
    public String test() {
        return "BFHL API is running successfully 🚀";
    }

    // ==============================
    // POST /bfhl (Main API)
    // ==============================
    @PostMapping("/bfhl")
    public BfhlResponse handle(@RequestBody BfhlRequest request) {

        String key = request.getKey();
        Object value = request.getValue();

        if (key == null || value == null) {
            throw new RuntimeException("key and value are required");
        }

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