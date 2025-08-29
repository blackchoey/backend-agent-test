/**
 * Main class for the backend agent test project.
 * 
 * This is a simple Java application that demonstrates basic console output
 * and serves as a starting point for the backend agent test project.
 * 
 * @author Backend Agent Test Team
 * @version 1.0
 * @since 1.0
 */
public class Main {
    
    /**
     * The main entry point of the application.
     * 
     * Prints a welcome message and demonstrates a simple loop
     * that outputs numbers from 1 to 5.
     * 
     * @param args command line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}