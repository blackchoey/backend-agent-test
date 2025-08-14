package com.example.teamsapp.controller;

import com.example.teamsapp.TeamsBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Bot Controller handles incoming HTTP requests to the bot endpoint
 * This controller receives messages from Microsoft Teams and forwards them to the bot
 */
@RestController
@RequestMapping("/api")
public class BotController {
    
    @Autowired
    private TeamsBot teamsBot;
    
    /**
     * Health check endpoint
     */
    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "healthy");
        response.put("service", "Teams Bot");
        return ResponseEntity.ok(response);
    }
    
    /**
     * Main endpoint for receiving messages from Microsoft Teams
     * In production, this would be secured and validated against Bot Framework
     */
    @PostMapping("/messages")
    public ResponseEntity<Map<String, Object>> receiveMessage(@RequestBody Map<String, Object> activity) {
        try {
            // Process the incoming message
            Map<String, Object> response = teamsBot.processMessage(activity);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Failed to process message");
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.internalServerError().body(errorResponse);
        }
    }
    
    /**
     * Endpoint for testing bot responses locally
     */
    @PostMapping("/test")
    public ResponseEntity<Map<String, Object>> testMessage(@RequestBody Map<String, String> request) {
        Map<String, Object> activity = new HashMap<>();
        activity.put("text", request.get("message"));
        
        Map<String, Object> response = teamsBot.processMessage(activity);
        return ResponseEntity.ok(response);
    }
    
    /**
     * Welcome endpoint for new members
     */
    @PostMapping("/welcome")
    public ResponseEntity<Map<String, Object>> welcome() {
        Map<String, Object> response = teamsBot.handleMembersAdded();
        return ResponseEntity.ok(response);
    }
}