# Documentation Analyzer for Java Projects

A comprehensive tool to identify missing documentation files in Java projects and provide actionable recommendations for improving project documentation.

## What This Tool Does

The Documentation Analyzer scans your Java project and generates a detailed report showing:

- **Current project structure** - Overview of your project layout
- **Existing documentation** - What documentation files are already present
- **Missing documentation** - Comprehensive list of missing documentation files, categorized by importance
- **Actionable recommendations** - Prioritized suggestions for improving your project's documentation

## Usage

### Method 1: Using the convenience script (Recommended)
```bash
./analyze-docs.sh [project-directory]
```

### Method 2: Direct Java execution
```bash
# Compile the analyzer
javac src/DocumentationAnalyzer.java

# Run the analysis
java -cp src DocumentationAnalyzer [project-directory]
```

If no project directory is specified, the current directory (`.`) is analyzed.

## Example Output

The tool provides a comprehensive report including:

- **Essential files** (Critical for any project): README.md, LICENSE
- **Recommended files** (Important for professional projects): CHANGELOG.md, API documentation, build instructions
- **Optional files** (Good for larger projects): Architecture docs, user guides, tutorials
- **Development files** (Helpful for contributors): CONTRIBUTING.md, CODE_OF_CONDUCT.md

## Documentation Categories

The tool categorizes missing documentation into four priority levels:

1. **Essential** - Critical files every project should have
2. **Recommended** - Important for professional and open-source projects
3. **Optional** - Valuable for larger or more complex projects
4. **Development** - Helpful for projects accepting contributions

## Features

- ✅ Comprehensive documentation file detection
- ✅ Project structure analysis
- ✅ Prioritized recommendations
- ✅ Support for common Java project layouts
- ✅ Detection of documentation directories (docs/, javadoc/, etc.)
- ✅ Multiple documentation format support (.md, .txt, .rst, .adoc)

## Requirements

- Java 8 or higher
- No external dependencies required

## Running the Tool

This tool is designed to help Java developers ensure their projects have comprehensive documentation. It's particularly useful for:

- New project setup
- Documentation audits
- Open source project preparation
- Team documentation standards enforcement

---

*This tool was created to address the need for identifying missing documentation files in Java projects and provides a comprehensive analysis to help improve project documentation quality.*