package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main application class demonstrating basic Java concepts
 * and backend development patterns.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Starting Backend Agent Test Application");
        
        System.out.println("Hello and welcome to the Backend Agent Test project!");
        
        // Demonstrate basic loop and logging
        for (int i = 1; i <= 5; i++) {
            logger.debug("Processing iteration: {}", i);
            System.out.println("Iteration " + i + " completed");
        }
        
        // Demonstrate utility class usage
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(10, 25);
        logger.info("Math operation result: {}", result);
        System.out.println("10 + 25 = " + result);
        
        logger.info("Application completed successfully");
    }
}