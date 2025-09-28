# Contributing to Backend Agent Test

Thank you for your interest in contributing to this project! This guide will help you get started with development and understand our contribution process.

## Project Overview

This is a simple Java project that demonstrates basic Java programming concepts. The main application prints a welcome message and counts from 1 to 5.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application entry point
├── out/                   # Compiled bytecode (generated)
├── .idea/                 # IntelliJ IDEA project files
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── CONTRIBUTING.md       # This file
```

## Development Environment Setup

### Prerequisites

- **Java Development Kit (JDK) 17 or higher**
  - Check your Java version: `java -version`
  - Download from [Eclipse Temurin](https://adoptium.net/) if needed

- **IDE (Recommended)**
  - IntelliJ IDEA (project is pre-configured)
  - Eclipse
  - VS Code with Java Extension Pack
  - Or any text editor of your choice

### Setting Up the Project

1. **Fork and Clone the Repository**
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Open in Your IDE**
   - For IntelliJ IDEA: Open the project folder directly
   - For other IDEs: Import as a Java project

3. **Verify Setup**
   ```bash
   # Compile the project
   mkdir -p out
   javac src/Main.java -d out/
   
   # Run the application
   java -cp out/ Main
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

## Building and Running

### Command Line

```bash
# Compile
mkdir -p out
javac src/Main.java -d out/

# Run
java -cp out/ Main

# Clean
rm -rf out/
```

### IDE Integration

- **IntelliJ IDEA**: Use the green arrow next to the `main` method or `Shift + F10`
- **Eclipse**: Right-click on Main.java → Run As → Java Application
- **VS Code**: Use the "Run Java" button or `F5`

## Code Style and Conventions

### Java Code Style

- Follow standard Java naming conventions:
  - Classes: `PascalCase`
  - Methods and variables: `camelCase`
  - Constants: `UPPER_SNAKE_CASE`
- Use 4 spaces for indentation (no tabs)
- Maximum line length: 120 characters
- Always use braces for control structures, even single-line statements

### Example

```java
public class MyClass {
    private static final int MAX_VALUE = 100;
    
    public void myMethod(String parameterName) {
        if (parameterName != null) {
            System.out.println("Processing: " + parameterName);
        }
    }
}
```

## How to Contribute

### Reporting Issues

1. Check existing issues to avoid duplicates
2. Use the issue template (if available)
3. Provide clear description and steps to reproduce
4. Include system information (Java version, OS)

### Submitting Changes

1. **Create a Feature Branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. **Make Your Changes**
   - Write clean, well-documented code
   - Follow the project's code style
   - Add comments for complex logic

3. **Test Your Changes**
   ```bash
   # Compile and run to ensure it works
   javac src/Main.java -d out/
   java -cp out/ Main
   ```

4. **Commit Your Changes**
   ```bash
   git add .
   git commit -m "Add feature: descriptive commit message"
   ```

5. **Push and Create Pull Request**
   ```bash
   git push origin feature/your-feature-name
   ```
   Then create a pull request on GitHub.

### Pull Request Guidelines

- **Title**: Use a clear, descriptive title
- **Description**: Explain what changes you made and why
- **Testing**: Describe how you tested your changes
- **Documentation**: Update documentation if needed

#### Pull Request Template

```markdown
## Description
Brief description of changes

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Documentation update
- [ ] Code refactoring

## Testing
- [ ] Code compiles without errors
- [ ] Application runs successfully
- [ ] Manual testing performed

## Checklist
- [ ] Code follows project style guidelines
- [ ] Self-review completed
- [ ] Documentation updated (if needed)
```

## Testing

### Manual Testing

Since this is a simple project, testing is primarily manual:

1. **Compilation Test**
   ```bash
   javac src/Main.java -d out/
   ```
   Should compile without errors.

2. **Runtime Test**
   ```bash
   java -cp out/ Main
   ```
   Should produce the expected output.

3. **Code Quality Check**
   - Ensure code follows style guidelines
   - Check for proper indentation and formatting
   - Verify meaningful variable and method names

### Future Testing Considerations

As the project grows, consider adding:
- Unit tests with JUnit
- Integration tests
- Code coverage tools
- Automated testing in CI/CD

## Getting Help

- **Issues**: Create an issue for bugs or feature requests
- **Discussions**: Use GitHub Discussions for questions
- **Documentation**: Check this CONTRIBUTING.md for guidance

## Code of Conduct

Please be respectful and constructive in all interactions. We want to maintain a welcoming environment for all contributors.

## License

By contributing to this project, you agree that your contributions will be licensed under the same license as the project.

---

Thank you for contributing to Backend Agent Test! 🚀