package com.workshop.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class TransactionController {

    @GetMapping("/process")
    public Map<String, Object> processTransaction() {
        Map<String, Object> response = new HashMap<>();
        response.put("confirmationNumber", UUID.randomUUID().toString());
        response.put("status", "SUCCESS");
        response.put("amount", 500.25);
        response.put("limit", 2000.0);
        return response;
    }
}
