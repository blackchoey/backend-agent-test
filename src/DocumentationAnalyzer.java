import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * DocumentationAnalyzer - A tool to identify missing documentation files for Java projects
 * 
 * This tool analyzes the current Java project structure and provides a comprehensive 
 * list of missing documentation files that are commonly expected in Java projects.
 */
public class DocumentationAnalyzer {
    
    private final String projectRoot;
    private final List<String> foundFiles;
    private final Map<String, DocumentationType> expectedDocumentation;
    
    public enum DocumentationType {
        ESSENTIAL("Essential - Critical for any project"),
        RECOMMENDED("Recommended - Important for professional projects"),
        OPTIONAL("Optional - Good to have for larger projects"),
        DEVELOPMENT("Development - Helpful for contributors");
        
        private final String description;
        
        DocumentationType(String description) {
            this.description = description;
        }
        
        public String getDescription() {
            return description;
        }
    }
    
    public DocumentationAnalyzer(String projectRoot) {
        this.projectRoot = projectRoot;
        this.foundFiles = new ArrayList<>();
        this.expectedDocumentation = initializeExpectedDocumentation();
    }
    
    /**
     * Initialize the map of expected documentation files for Java projects
     */
    private Map<String, DocumentationType> initializeExpectedDocumentation() {
        Map<String, DocumentationType> docs = new LinkedHashMap<>();
        
        // Essential documentation
        docs.put("README.md", DocumentationType.ESSENTIAL);
        docs.put("LICENSE", DocumentationType.ESSENTIAL);
        docs.put("LICENSE.txt", DocumentationType.ESSENTIAL);
        docs.put("LICENSE.md", DocumentationType.ESSENTIAL);
        
        // Build and setup documentation
        docs.put("INSTALL.md", DocumentationType.RECOMMENDED);
        docs.put("BUILD.md", DocumentationType.RECOMMENDED);
        docs.put("SETUP.md", DocumentationType.RECOMMENDED);
        docs.put("QUICKSTART.md", DocumentationType.RECOMMENDED);
        
        // Project management documentation
        docs.put("CHANGELOG.md", DocumentationType.RECOMMENDED);
        docs.put("HISTORY.md", DocumentationType.RECOMMENDED);
        docs.put("RELEASE_NOTES.md", DocumentationType.RECOMMENDED);
        docs.put("ROADMAP.md", DocumentationType.OPTIONAL);
        
        // Contribution and development
        docs.put("CONTRIBUTING.md", DocumentationType.DEVELOPMENT);
        docs.put("CODE_OF_CONDUCT.md", DocumentationType.DEVELOPMENT);
        docs.put("SECURITY.md", DocumentationType.DEVELOPMENT);
        docs.put("SUPPORT.md", DocumentationType.DEVELOPMENT);
        
        // API and technical documentation
        docs.put("API.md", DocumentationType.RECOMMENDED);
        docs.put("docs/", DocumentationType.RECOMMENDED);
        docs.put("doc/", DocumentationType.RECOMMENDED);
        docs.put("documentation/", DocumentationType.OPTIONAL);
        
        // Architecture and design
        docs.put("ARCHITECTURE.md", DocumentationType.OPTIONAL);
        docs.put("DESIGN.md", DocumentationType.OPTIONAL);
        docs.put("docs/architecture.md", DocumentationType.OPTIONAL);
        docs.put("docs/design.md", DocumentationType.OPTIONAL);
        
        // User guides
        docs.put("USER_GUIDE.md", DocumentationType.OPTIONAL);
        docs.put("TUTORIAL.md", DocumentationType.OPTIONAL);
        docs.put("docs/user-guide.md", DocumentationType.OPTIONAL);
        docs.put("docs/tutorial.md", DocumentationType.OPTIONAL);
        
        // Configuration and deployment
        docs.put("CONFIGURATION.md", DocumentationType.OPTIONAL);
        docs.put("DEPLOYMENT.md", DocumentationType.OPTIONAL);
        docs.put("TROUBLESHOOTING.md", DocumentationType.OPTIONAL);
        
        // Java-specific documentation
        docs.put("javadoc/", DocumentationType.RECOMMENDED);
        docs.put("target/site/apidocs/", DocumentationType.RECOMMENDED);
        docs.put("build/docs/javadoc/", DocumentationType.RECOMMENDED);
        
        return docs;
    }
    
    /**
     * Analyze the project and identify missing documentation files
     */
    public void analyzeProject() {
        System.out.println("=".repeat(80));
        System.out.println("DOCUMENTATION ANALYSIS REPORT FOR JAVA PROJECT");
        System.out.println("=".repeat(80));
        System.out.println("Project Root: " + new File(projectRoot).getAbsolutePath());
        System.out.println("Analysis Date: " + new Date());
        System.out.println();
        
        // Scan for existing files
        scanExistingFiles();
        
        // Report findings
        reportProjectStructure();
        reportExistingDocumentation();
        reportMissingDocumentation();
        reportRecommendations();
    }
    
    /**
     * Scan the project directory for existing documentation files
     */
    private void scanExistingFiles() {
        try {
            Files.walk(Paths.get(projectRoot))
                .filter(Files::isRegularFile)
                .map(Path::toString)
                .filter(this::isDocumentationFile)
                .forEach(foundFiles::add);
                
            // Also scan for documentation directories
            Files.walk(Paths.get(projectRoot))
                .filter(Files::isDirectory)
                .map(Path::toString)
                .filter(this::isDocumentationDirectory)
                .forEach(foundFiles::add);
                
        } catch (IOException e) {
            System.err.println("Error scanning project directory: " + e.getMessage());
        }
    }
    
    /**
     * Check if a file is likely to be documentation
     */
    private boolean isDocumentationFile(String filePath) {
        String fileName = new File(filePath).getName().toLowerCase();
        return fileName.endsWith(".md") || 
               fileName.endsWith(".txt") || 
               fileName.endsWith(".rst") ||
               fileName.endsWith(".adoc") ||
               fileName.equals("license") ||
               fileName.equals("readme") ||
               fileName.equals("changelog") ||
               fileName.equals("authors") ||
               fileName.equals("contributors") ||
               fileName.equals("todo");
    }
    
    /**
     * Check if a directory is likely to contain documentation
     */
    private boolean isDocumentationDirectory(String dirPath) {
        String dirName = new File(dirPath).getName().toLowerCase();
        return dirName.equals("docs") || 
               dirName.equals("doc") || 
               dirName.equals("documentation") ||
               dirName.equals("javadoc") ||
               dirPath.contains("apidocs") ||
               dirPath.contains("site");
    }
    
    /**
     * Report the current project structure
     */
    private void reportProjectStructure() {
        System.out.println("PROJECT STRUCTURE OVERVIEW:");
        System.out.println("-".repeat(40));
        
        try {
            Files.walk(Paths.get(projectRoot), 2)
                .filter(path -> !path.toString().contains("/.git/") && 
                              !path.toString().contains("/.idea/"))
                .forEach(path -> {
                    int depth = path.getNameCount() - Paths.get(projectRoot).getNameCount();
                    String indent = "  ".repeat(depth);
                    String name = path.getFileName().toString();
                    String type = Files.isDirectory(path) ? "/" : "";
                    System.out.println(indent + name + type);
                });
        } catch (IOException e) {
            System.err.println("Error reading project structure: " + e.getMessage());
        }
        System.out.println();
    }
    
    /**
     * Report existing documentation files
     */
    private void reportExistingDocumentation() {
        System.out.println("EXISTING DOCUMENTATION FILES:");
        System.out.println("-".repeat(40));
        
        if (foundFiles.isEmpty()) {
            System.out.println("❌ NO DOCUMENTATION FILES FOUND");
        } else {
            foundFiles.forEach(file -> System.out.println("✅ " + file));
        }
        System.out.println();
    }
    
    /**
     * Report missing documentation files categorized by importance
     */
    private void reportMissingDocumentation() {
        System.out.println("MISSING DOCUMENTATION FILES:");
        System.out.println("-".repeat(40));
        
        Map<DocumentationType, List<String>> missingByType = new LinkedHashMap<>();
        
        // Initialize categories
        for (DocumentationType type : DocumentationType.values()) {
            missingByType.put(type, new ArrayList<>());
        }
        
        // Categorize missing files
        expectedDocumentation.entrySet().stream()
            .filter(entry -> !isFilePresent(entry.getKey()))
            .forEach(entry -> missingByType.get(entry.getValue()).add(entry.getKey()));
        
        // Report by category
        for (DocumentationType type : DocumentationType.values()) {
            List<String> missing = missingByType.get(type);
            if (!missing.isEmpty()) {
                System.out.println("\n" + type.name() + " - " + type.getDescription() + ":");
                missing.forEach(file -> System.out.println("  ❌ " + file));
            }
        }
        
        System.out.println();
    }
    
    /**
     * Check if a documentation file is present in the project
     */
    private boolean isFilePresent(String expectedFile) {
        String projectPath = new File(projectRoot).getAbsolutePath();
        
        // Check exact match
        File exactFile = new File(projectRoot, expectedFile);
        if (exactFile.exists()) {
            return true;
        }
        
        // Check if any found file matches
        return foundFiles.stream()
            .anyMatch(found -> {
                String relativePath = new File(found).getAbsolutePath()
                    .replace(projectPath, "")
                    .replace("\\", "/")
                    .replaceFirst("^/", "");
                return relativePath.equals(expectedFile) || 
                       relativePath.endsWith("/" + expectedFile) ||
                       new File(found).getName().equalsIgnoreCase(new File(expectedFile).getName());
            });
    }
    
    /**
     * Provide recommendations for improving project documentation
     */
    private void reportRecommendations() {
        System.out.println("RECOMMENDATIONS:");
        System.out.println("-".repeat(40));
        
        System.out.println("📋 HIGH PRIORITY (Essential):");
        System.out.println("   1. Create README.md - Project overview, description, and basic usage");
        System.out.println("   2. Add LICENSE file - Define usage terms and conditions");
        
        System.out.println("\n📋 MEDIUM PRIORITY (Recommended):");
        System.out.println("   3. Add CHANGELOG.md - Track version changes and updates");
        System.out.println("   4. Create API documentation using JavaDoc");
        System.out.println("   5. Add build/installation instructions");
        
        System.out.println("\n📋 LOW PRIORITY (Optional but valuable):");
        System.out.println("   6. Add CONTRIBUTING.md - Guidelines for contributors");
        System.out.println("   7. Create architecture/design documentation");
        System.out.println("   8. Add user guides and tutorials");
        
        System.out.println("\n💡 QUICK WINS:");
        System.out.println("   • Start with a basic README.md explaining what the project does");
        System.out.println("   • Add inline JavaDoc comments to your Java classes");
        System.out.println("   • Consider using tools like Maven or Gradle for automated documentation");
        
        System.out.println("\n" + "=".repeat(80));
    }
    
    /**
     * Main method to run the documentation analysis
     */
    public static void main(String[] args) {
        String projectRoot = args.length > 0 ? args[0] : ".";
        
        DocumentationAnalyzer analyzer = new DocumentationAnalyzer(projectRoot);
        analyzer.analyzeProject();
    }
}