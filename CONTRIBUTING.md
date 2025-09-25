# Contributing to Backend Agent Test

Thank you for your interest in contributing to this project! This guide will help you get started with contributing to our Java application.

## Table of Contents

- [Getting Started](#getting-started)
- [Development Setup](#development-setup)
- [Development Workflow](#development-workflow)
- [Code Standards](#code-standards)
- [Testing](#testing)
- [Submitting Changes](#submitting-changes)
- [Getting Help](#getting-help)

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK) 17 or higher**
  - You can download it from [Eclipse Temurin](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
  - Verify installation: `java -version`
- **Git** for version control
- **IDE of your choice** (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Fork and Clone

1. Fork this repository on GitHub
2. Clone your fork locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```
3. Add the original repository as upstream:
   ```bash
   git remote add upstream https://github.com/blackchoey/backend-agent-test.git
   ```

## Development Setup

This is a simple Java project without a build system like Maven or Gradle. The project structure is:

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .gitignore             # Git ignore rules
├── test.iml               # IntelliJ IDEA module file
└── CONTRIBUTING.md        # This file
```

### Compiling and Running

To compile and run the application:

```bash
# Compile the Java source files
javac src/Main.java -d out

# Run the compiled application
java -cp out Main
```

Expected output:
```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

### IDE Setup

#### IntelliJ IDEA
1. Open the project directory in IntelliJ IDEA
2. The project should be automatically recognized as a Java project
3. Make sure the JDK is properly configured in Project Settings

#### Other IDEs
1. Import the project as a Java project
2. Set `src/` as the source directory
3. Configure the JDK version to 17 or higher

## Development Workflow

1. **Create a feature branch** from the main branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. **Make your changes** following the code standards below

3. **Test your changes** by compiling and running the application

4. **Commit your changes** with descriptive commit messages:
   ```bash
   git add .
   git commit -m "Add feature: brief description of changes"
   ```

5. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

6. **Create a Pull Request** on GitHub

## Code Standards

### Java Coding Conventions

- Follow [Oracle's Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
- Use 4 spaces for indentation (no tabs)
- Use meaningful variable and method names
- Add comments for complex logic or business rules
- Keep methods focused and reasonably sized

### Example Code Style

```java
public class Example {
    // Class-level constants in UPPER_CASE
    private static final int MAX_ITERATIONS = 5;
    
    // Method names in camelCase
    public void doSomething() {
        // Local variables in camelCase
        int currentIteration = 0;
        
        // Use meaningful variable names
        for (int i = 1; i <= MAX_ITERATIONS; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

### Formatting

- Opening braces on the same line as the declaration
- Proper spacing around operators and after commas
- Consistent indentation throughout the file

## Testing

Currently, this project doesn't have a formal testing framework set up. When making changes:

1. **Manual Testing**: Always compile and run the application to ensure it works as expected
2. **Regression Testing**: Make sure existing functionality still works after your changes
3. **Edge Cases**: Consider and test edge cases for your changes

### Testing Your Changes

```bash
# Always test compilation
javac src/Main.java -d out

# Test execution
java -cp out Main

# Verify the output matches expectations
```

## Submitting Changes

### Pull Request Guidelines

1. **Title**: Use a clear and descriptive title
   - Good: "Add input validation for user data"
   - Bad: "Fix stuff"

2. **Description**: Provide a detailed description including:
   - What changes were made and why
   - How to test the changes
   - Any breaking changes or considerations

3. **Small, Focused Changes**: Keep pull requests focused on a single feature or fix

4. **Clean History**: Consider squashing commits if you have many small, incremental commits

### Pull Request Template

```markdown
## Description
Brief description of the changes made.

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Breaking change
- [ ] Documentation update

## Testing
- [ ] Code compiles successfully
- [ ] Application runs without errors
- [ ] Manual testing completed
- [ ] Existing functionality verified

## Additional Notes
Any additional information that reviewers should know.
```

## Getting Help

If you need help or have questions:

1. **Check existing issues** on GitHub for similar problems
2. **Create a new issue** if you find a bug or want to suggest a feature
3. **Ask questions** in pull request discussions
4. **Review the code** to understand the current implementation

## Code of Conduct

- Be respectful and inclusive in all interactions
- Provide constructive feedback in code reviews
- Help newcomers and share knowledge
- Focus on the code and ideas, not the person

## Thank You!

Your contributions help make this project better for everyone. Thank you for taking the time to contribute!