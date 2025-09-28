import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Test class for Main application
 */
public class MainTest {

    @Test
    @DisplayName("Test main method output")
    public void testMainOutput() {
        // Capture System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Run the main method
            Main.main(new String[]{});

            // Get the captured output
            String output = outputStream.toString();

            // Verify the expected output
            assertTrue(output.contains("Hello and welcome!"), "Should contain welcome message");
            assertTrue(output.contains("i = 1"), "Should contain i = 1");
            assertTrue(output.contains("i = 2"), "Should contain i = 2");
            assertTrue(output.contains("i = 3"), "Should contain i = 3");
            assertTrue(output.contains("i = 4"), "Should contain i = 4");
            assertTrue(output.contains("i = 5"), "Should contain i = 5");

        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }

    @Test
    @DisplayName("Test that Main class exists and has main method")
    public void testMainClassExists() {
        assertDoesNotThrow(() -> {
            Class<?> mainClass = Class.forName("Main");
            mainClass.getMethod("main", String[].class);
        }, "Main class should exist with main method");
    }
}