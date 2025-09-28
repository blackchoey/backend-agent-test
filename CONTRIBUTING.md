# Contributing to Backend Agent Test

We welcome contributions to the Backend Agent Test project! This document provides guidelines for contributing to this repository.

## Code of Conduct

By participating in this project, you are expected to uphold our [Code of Conduct](CODE_OF_CONDUCT.md).

## How to Contribute

### Reporting Issues

1. **Check existing issues** first to avoid duplicates
2. **Use the issue template** if available
3. **Provide clear and detailed information** including:
   - Java version
   - Operating system
   - Steps to reproduce the issue
   - Expected vs actual behavior
   - Error messages or logs

### Submitting Pull Requests

1. **Fork the repository** and create your branch from `main`
2. **Make your changes** following the coding standards below
3. **Test your changes** thoroughly
4. **Update documentation** if necessary
5. **Submit a pull request** with a clear description of your changes

### Development Setup

1. Ensure you have Java 17+ installed
2. Clone your fork of the repository
3. Compile and test the application:
   ```bash
   javac src/Main.java -d out
   java -cp out Main
   ```

## Coding Standards

### Java Code Style

- Use **4 spaces** for indentation (no tabs)
- Follow **standard Java naming conventions**:
  - Classes: `PascalCase`
  - Methods and variables: `camelCase`
  - Constants: `UPPER_SNAKE_CASE`
- **Keep lines under 120 characters**
- **Add comments** for complex logic
- **Use meaningful variable and method names**

### Commit Messages

- Use the **present tense** ("Add feature" not "Added feature")
- Use the **imperative mood** ("Move cursor to..." not "Moves cursor to...")
- **Limit the first line to 72 characters or less**
- **Reference issues and pull requests** liberally after the first line

Example:
```
Add input validation for user parameters

- Validate command line arguments
- Add error handling for invalid inputs
- Update tests for new validation logic

Fixes #123
```

## Testing

- **Test your changes** before submitting a pull request
- **Ensure the application compiles and runs without errors**
- **Add tests for new functionality** when applicable

## Questions?

If you have questions about contributing, please:
1. Check the existing documentation
2. Search through existing issues
3. Open a new issue with the `question` label

Thank you for contributing to Backend Agent Test!