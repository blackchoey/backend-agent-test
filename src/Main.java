import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Conversation Summary Tool!");
        
        if (args.length > 0) {
            // Process command line arguments as conversation
            String conversation = String.join(" ", args);
            String summary = summarizeConversation(conversation);
            System.out.println("Conversation Summary:");
            System.out.println(summary);
        } else {
            // Interactive mode
            Scanner scanner = new Scanner(System.in);
            List<String> conversation = new ArrayList<>();
            
            System.out.println("Please enter your conversation (type 'END' to finish):");
            
            String line;
            while (!(line = scanner.nextLine()).equals("END")) {
                conversation.add(line);
            }
            
            if (conversation.isEmpty()) {
                System.out.println("It seems that the conversation you intended to provide is missing. Please share the details of the conversation so I can create a summary for you.");
            } else {
                String fullConversation = String.join(" ", conversation);
                String summary = summarizeConversation(fullConversation);
                System.out.println("\nConversation Summary:");
                System.out.println(summary);
            }
            
            scanner.close();
        }
    }
    
    public static String summarizeConversation(String conversation) {
        if (conversation == null || conversation.trim().isEmpty()) {
            return "No conversation content provided to summarize.";
        }
        
        String[] words = conversation.trim().split("\\s+");
        int wordCount = words.length;
        
        // Simple summary logic
        StringBuilder summary = new StringBuilder();
        summary.append("Summary: ");
        
        if (wordCount <= 10) {
            summary.append("Short conversation with ").append(wordCount).append(" words. ");
            summary.append("Key content: ").append(conversation);
        } else if (wordCount <= 50) {
            summary.append("Medium-length conversation with ").append(wordCount).append(" words. ");
            // Take first and last few words
            String[] firstWords = new String[Math.min(5, words.length)];
            System.arraycopy(words, 0, firstWords, 0, firstWords.length);
            String beginning = String.join(" ", firstWords);
            summary.append("Begins with: '").append(beginning).append("...'");
        } else {
            summary.append("Long conversation with ").append(wordCount).append(" words. ");
            // Take first few words
            String[] firstWords = new String[Math.min(8, words.length)];
            System.arraycopy(words, 0, firstWords, 0, firstWords.length);
            String beginning = String.join(" ", firstWords);
            summary.append("Main topic appears to focus on: '").append(beginning).append("...'");
        }
        
        return summary.toString();
    }
}