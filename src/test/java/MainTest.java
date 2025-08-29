import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the Main class.
 * Tests the console output functionality.
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
        // Given
        String[] args = {};
        
        // When
        Main.main(args);
        
        // Then
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Hello and welcome!"), "Output should contain welcome message");
        assertTrue(output.contains("i = 1"), "Output should contain i = 1");
        assertTrue(output.contains("i = 2"), "Output should contain i = 2");
        assertTrue(output.contains("i = 3"), "Output should contain i = 3");
        assertTrue(output.contains("i = 4"), "Output should contain i = 4");
        assertTrue(output.contains("i = 5"), "Output should contain i = 5");
    }

    @Test
    public void testMainIterationCount() {
        // Given
        String[] args = {};
        
        // When
        Main.main(args);
        
        // Then
        String output = outputStreamCaptor.toString();
        
        // Count occurrences of "i = " to verify the loop runs exactly 5 times
        long count = output.lines()
                .filter(line -> line.contains("i = "))
                .count();
        assertEquals(5, count, "Loop should run exactly 5 times");
    }
}