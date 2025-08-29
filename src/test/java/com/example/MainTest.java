package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for the Main class.
 */
public class MainTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainMethod() {
        // Test that main method runs without exceptions
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }

    @Test
    public void testMainOutput() {
        // Test the output of the main method
        Main.main(new String[]{});
        
        String output = outputStream.toString();
        
        // Check that the welcome message is present
        assertTrue(output.contains("Hello and welcome!"));
        
        // Check that all loop iterations are present
        for (int i = 1; i <= 5; i++) {
            assertTrue(output.contains("i = " + i));
        }
    }

    @Test
    public void testMainWithEmptyArgs() {
        // Test that main method works with empty arguments
        String[] emptyArgs = {};
        assertDoesNotThrow(() -> {
            Main.main(emptyArgs);
        });
    }

    @Test
    public void testMainWithNullArgs() {
        // Test that main method works with null arguments
        assertDoesNotThrow(() -> {
            Main.main(null);
        });
    }
}