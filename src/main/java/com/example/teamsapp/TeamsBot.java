package com.example.teamsapp;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Teams Bot Logic
 * This class handles message processing and response generation for the Teams app
 * In a full implementation, this would integrate with Microsoft Bot Framework
 */
@Component
public class TeamsBot {

    /**
     * Process incoming messages and generate appropriate responses
     */
    public Map<String, Object> processMessage(Map<String, Object> activity) {
        String messageText = extractMessageText(activity);
        String responseText = generateResponse(messageText);
        
        return createResponse(responseText);
    }

    /**
     * Handle new member additions to teams
     */
    public Map<String, Object> handleMembersAdded() {
        String welcomeText = "Welcome to the Teams Bot! 🤖\n\n" +
                "I can help you with:\n" +
                "• Type 'help' to see available commands\n" +
                "• Type 'about' to learn more about this bot\n" +
                "• Just chat with me and I'll respond!";

        return createResponse(welcomeText);
    }

    /**
     * Extract message text from Teams activity
     */
    private String extractMessageText(Map<String, Object> activity) {
        if (activity != null && activity.containsKey("text")) {
            return (String) activity.get("text");
        }
        return "";
    }

    /**
     * Generate appropriate responses based on user input
     */
    private String generateResponse(String userMessage) {
        if (userMessage == null || userMessage.trim().isEmpty()) {
            return "I didn't receive any message. Please try again!";
        }
        
        String message = userMessage.toLowerCase().trim();
        
        switch (message) {
            case "help":
                return "🆘 **Available Commands:**\n\n" +
                       "• `help` - Show this help message\n" +
                       "• `about` - Learn about this bot\n" +
                       "• `time` - Get current time\n" +
                       "• `hello` - Get a friendly greeting\n" +
                       "• Just type anything else to chat!";
                       
            case "about":
                return "🤖 **About This Bot**\n\n" +
                       "This is a Microsoft Teams bot built with Java and Spring Boot.\n" +
                       "It demonstrates basic bot functionality including:\n" +
                       "• Message handling\n" +
                       "• Welcome messages\n" +
                       "• Command processing\n" +
                       "• Teams integration";
                       
            case "time":
                return "🕐 Current time: " + LocalDateTime.now().toString();
                
            case "hello":
            case "hi":
            case "hey":
                return "👋 Hello there! How can I help you today?";
                
            default:
                return "💬 You said: \"" + userMessage + "\"\n\n" +
                       "I'm a simple bot, but I heard you! Type 'help' to see what I can do.";
        }
    }

    /**
     * Create a response object in Teams Bot Framework format
     */
    private Map<String, Object> createResponse(String text) {
        Map<String, Object> response = new HashMap<>();
        response.put("type", "message");
        response.put("text", text);
        response.put("timestamp", LocalDateTime.now().toString());
        return response;
    }
}