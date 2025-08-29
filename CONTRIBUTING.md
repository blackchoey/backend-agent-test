# Contributing to Backend Agent Test

We appreciate your interest in contributing to this project! This document provides guidelines for contributing to make the process as smooth as possible.

## How to Contribute

### 1. Fork the Repository
- Fork the repository on GitHub
- Clone your fork locally:
  ```bash
  git clone https://github.com/your-username/backend-agent-test.git
  cd backend-agent-test
  ```

### 2. Set Up Development Environment
- Ensure you have Java 17 or higher installed
- Ensure you have Maven 3.6+ installed
- Verify your setup by running:
  ```bash
  mvn clean compile test
  ```

### 3. Create a Feature Branch
- Create a new branch for your feature or bug fix:
  ```bash
  git checkout -b feature/your-feature-name
  ```
  or
  ```bash
  git checkout -b fix/issue-description
  ```

### 4. Make Your Changes
- Write clean, maintainable code
- Follow Java coding conventions
- Add tests for new functionality
- Ensure all existing tests pass

### 5. Test Your Changes
- Run the full test suite:
  ```bash
  mvn test
  ```
- Verify the application still runs:
  ```bash
  mvn exec:java -Dexec.mainClass="com.example.Main"
  ```

### 6. Commit Your Changes
- Write clear, descriptive commit messages
- Use the present tense ("Add feature" not "Added feature")
- Reference issues and pull requests when applicable

### 7. Submit a Pull Request
- Push your branch to your fork
- Open a pull request against the main repository
- Provide a clear description of your changes
- Link to any relevant issues

## Code Style Guidelines

### Java Conventions
- Use 4 spaces for indentation
- Follow standard Java naming conventions
- Keep methods small and focused
- Add JavaDoc comments for public methods and classes

### Testing
- Write unit tests for all new functionality
- Use descriptive test method names
- Follow the Arrange-Act-Assert pattern
- Maintain test coverage

## Project Structure

```
├── src/
│   ├── main/java/com/example/    # Main source code
│   └── test/java/com/example/    # Test code
├── pom.xml                       # Maven configuration
├── README.md                     # Project documentation
├── CONTRIBUTING.md               # This file
└── LICENSE                       # License information
```

## Building the Project

```bash
# Compile the project
mvn compile

# Run tests
mvn test

# Create JAR file
mvn package

# Run the application
mvn exec:java -Dexec.mainClass="com.example.Main"
```

## Reporting Issues

When reporting issues, please include:
- A clear description of the problem
- Steps to reproduce the issue
- Expected vs. actual behavior
- Your Java and Maven versions
- Operating system information

## Code of Conduct

- Be respectful and inclusive
- Provide constructive feedback
- Focus on what is best for the community
- Show empathy towards other community members

## Questions?

If you have questions about contributing, feel free to open an issue for discussion.

Thank you for contributing!