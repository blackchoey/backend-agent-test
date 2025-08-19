import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Test class for Main application.
 */
public class MainTest {

    @Test
    @DisplayName("Test main method executes without errors")
    public void testMainMethodExecutesWithoutErrors() {
        // Capture system output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Execute main method
            assertDoesNotThrow(() -> Main.main(new String[]{}));
            
            // Verify output contains expected content
            String output = outputStream.toString();
            assertTrue(output.contains("Hello and welcome!"), 
                "Output should contain welcome message");
            assertTrue(output.contains("i = 1"), 
                "Output should contain loop output");
            assertTrue(output.contains("i = 5"), 
                "Output should contain final loop iteration");
        } finally {
            // Restore original system output
            System.setOut(originalOut);
        }
    }

    @Test
    @DisplayName("Test main method with null arguments")
    public void testMainMethodWithNullArguments() {
        // Should not throw exception with null arguments
        assertDoesNotThrow(() -> Main.main(null));
    }
}