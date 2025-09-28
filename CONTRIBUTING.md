# Contributing to Backend Agent Test

We welcome contributions to this project! This document provides guidelines for contributing.

## Getting Started

1. Fork the repository on GitHub
2. Clone your fork locally
3. Create a new branch for your feature or bug fix
4. Make your changes
5. Test your changes
6. Submit a pull request

## Development Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Git
- A Java IDE (IntelliJ IDEA recommended)

### Setting Up Your Development Environment

1. Clone your fork:
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```

2. Compile and test:
   ```bash
   javac src/Main.java
   java -cp src Main
   ```

## Making Changes

### Code Style

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Add comments for complex logic
- Keep methods small and focused

### Testing

- Ensure your code compiles without errors
- Test the application runs correctly
- Verify the expected output matches the documentation

### Commit Messages

- Use clear and descriptive commit messages
- Start with a verb in the imperative mood (e.g., "Add", "Fix", "Update")
- Keep the first line under 50 characters
- Add a blank line before a more detailed description if needed

Example:
```
Add error handling for invalid input

- Check for null arguments in main method
- Display helpful error message for users
- Exit gracefully with appropriate status code
```

## Pull Request Process

1. Update the README.md with details of changes if applicable
2. Update the version number in any applicable files
3. Ensure all tests pass
4. Ensure your code follows the project's coding standards
5. Create a pull request with a clear title and description

### Pull Request Guidelines

- Reference any related issues in your PR description
- Include a summary of the changes made
- Explain why the changes are necessary
- Add screenshots or examples if applicable

## Reporting Issues

When reporting issues, please include:

- A clear and descriptive title
- A detailed description of the issue
- Steps to reproduce the problem
- Expected vs. actual behavior
- Java version and operating system
- Any relevant error messages or logs

## Code of Conduct

This project adheres to a [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code.

## Questions?

If you have questions about contributing, please:

- Check existing issues and pull requests
- Create a new issue with the "question" label
- Contact the maintainers directly

Thank you for contributing to Backend Agent Test!