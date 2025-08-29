package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Main class.
 */
public class MainTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testMainOutput() {
        // Arrange
        String[] args = {};
        
        // Act
        Main.main(args);
        
        // Assert
        String actualOutput = outputStreamCaptor.toString();
        
        // Verify the welcome message is printed
        assertTrue(actualOutput.contains("Hello and welcome!"), 
                  "Output should contain welcome message");
        
        // Verify all numbers from 1 to 5 are printed
        for (int i = 1; i <= 5; i++) {
            assertTrue(actualOutput.contains("i = " + i), 
                      "Output should contain 'i = " + i + "'");
        }
    }

    @Test
    public void testMainMethodExists() {
        // Verify that the main method exists and is accessible
        assertDoesNotThrow(() -> {
            Main.class.getMethod("main", String[].class);
        }, "Main method should exist and be public");
    }
}