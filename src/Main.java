import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConversationSummarizer summarizer = new ConversationSummarizer();
        summarizer.run();
    }
}

class ConversationSummarizer {
    private Scanner scanner;
    
    public ConversationSummarizer() {
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        System.out.println("Hello and welcome to the Conversation Summarizer!");
        
        String conversation = getConversationInput();
        
        if (conversation == null || conversation.trim().isEmpty()) {
            handleMissingConversation();
        } else {
            String summary = generateSummary(conversation);
            displaySummary(summary);
        }
        
        scanner.close();
    }
    
    private String getConversationInput() {
        System.out.println("\nPlease provide the conversation details you'd like me to summarize:");
        System.out.println("(You can paste multiple lines. When finished, type 'END' on a new line)");
        System.out.print("> ");
        
        StringBuilder conversation = new StringBuilder();
        String line;
        
        while (!(line = scanner.nextLine()).equals("END")) {
            conversation.append(line).append("\n");
        }
        
        return conversation.toString().trim();
    }
    
    private void handleMissingConversation() {
        System.out.println("\nIt seems that the conversation you intended to provide is missing.");
        System.out.println("Please share the details of the conversation so I can create a summary for you.");
        
        if (scanner.hasNextLine()) {
            System.out.println("\nWould you like to try again? (y/n): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("y") || response.equals("yes")) {
                run(); // Recursively call to try again
            } else {
                System.out.println("Thank you for using the Conversation Summarizer. Goodbye!");
            }
        } else {
            System.out.println("No additional input available. Please run the program again with conversation details.");
        }
    }
    
    private String generateSummary(String conversation) {
        // Simple summary generation logic
        String[] lines = conversation.split("\n");
        int lineCount = lines.length;
        int wordCount = conversation.split("\\s+").length;
        
        StringBuilder summary = new StringBuilder();
        summary.append("CONVERSATION SUMMARY\n");
        summary.append("==================\n\n");
        summary.append("Statistics:\n");
        summary.append("- Total lines: ").append(lineCount).append("\n");
        summary.append("- Total words: ").append(wordCount).append("\n\n");
        
        summary.append("Content Overview:\n");
        if (lineCount > 0) {
            summary.append("- First line: ").append(lines[0].substring(0, Math.min(50, lines[0].length())));
            if (lines[0].length() > 50) summary.append("...");
            summary.append("\n");
            
            if (lineCount > 1) {
                summary.append("- Last line: ").append(lines[lineCount-1].substring(0, Math.min(50, lines[lineCount-1].length())));
                if (lines[lineCount-1].length() > 50) summary.append("...");
                summary.append("\n");
            }
        }
        
        // Key topics extraction (simple keyword frequency)
        summary.append("\nKey Topics (most frequent words):\n");
        String[] words = conversation.toLowerCase().split("\\s+");
        java.util.Map<String, Integer> wordFreq = new java.util.HashMap<>();
        
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > 3) { // Only consider words longer than 3 characters
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }
        
        wordFreq.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .limit(5)
            .forEach(entry -> summary.append("- ").append(entry.getKey()).append(" (").append(entry.getValue()).append(" times)\n"));
        
        return summary.toString();
    }
    
    private void displaySummary(String summary) {
        System.out.println("\n" + summary);
        System.out.println("\nSummary generation complete!");
    }
}