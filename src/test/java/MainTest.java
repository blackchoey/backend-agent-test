import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Main application.
 * Tests the main method output and basic functionality.
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
        // When
        Main.main(new String[]{});
        
        // Then
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Hello and welcome!"), 
                   "Output should contain welcome message");
        
        // Check that all loop iterations are present
        for (int i = 1; i <= 5; i++) {
            assertTrue(output.contains("i = " + i), 
                       "Output should contain 'i = " + i + "'");
        }
    }

    @Test
    public void testMainWithArguments() {
        // When - Test that main method can handle arguments without crashing
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"arg1", "arg2"});
        }, "Main method should handle arguments without throwing exceptions");
    }
}