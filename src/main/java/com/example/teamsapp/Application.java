package com.example.teamsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Microsoft Teams Bot
 * This class bootstraps the Spring Boot application that hosts the Teams bot
 */
@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        System.out.println("Starting Microsoft Teams Bot Application...");
        SpringApplication.run(Application.class, args);
    }
}