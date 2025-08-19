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
    public void testMainMethodOutput() {
        // Act
        Main.main(new String[]{});

        // Assert
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Hello and welcome!"), "Output should contain welcome message");
        assertTrue(output.contains("i = 1"), "Output should contain first iteration");
        assertTrue(output.contains("i = 2"), "Output should contain second iteration");
        assertTrue(output.contains("i = 3"), "Output should contain third iteration");
        assertTrue(output.contains("i = 4"), "Output should contain fourth iteration");
        assertTrue(output.contains("i = 5"), "Output should contain fifth iteration");
    }

    @Test
    public void testMainMethodWithEmptyArgs() {
        // Arrange
        String[] emptyArgs = {};

        // Act & Assert - Should not throw any exception
        assertDoesNotThrow(() -> Main.main(emptyArgs));
    }

    @Test
    public void testMainMethodWithNullArgs() {
        // Act & Assert - Should not throw any exception
        assertDoesNotThrow(() -> Main.main(null));
    }
}