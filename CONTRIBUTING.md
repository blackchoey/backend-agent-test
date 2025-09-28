# Contributing to Binary Search Implementation

Thank you for your interest in contributing to this project! We welcome contributions from everyone.

## Code of Conduct

This project adheres to a [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code.

## How to Contribute

### Reporting Bugs

Before creating bug reports, please check existing issues to avoid duplicates. When creating a bug report, include:

- A clear and descriptive title
- Steps to reproduce the issue
- Expected behavior vs actual behavior
- Java version and operating system
- Code sample that demonstrates the issue

### Suggesting Enhancements

Enhancement suggestions are welcome! Please provide:

- A clear and descriptive title
- Detailed description of the proposed enhancement
- Examples of how the enhancement would be used
- Rationale for why this enhancement would be useful

### Pull Requests

1. **Fork the repository** and create your branch from `main`
2. **Make your changes** following our coding standards
3. **Test your changes** thoroughly
4. **Update documentation** if necessary
5. **Submit a pull request**

#### Development Setup

1. Fork and clone the repository:
   ```bash
   git clone https://github.com/your-username/backend-agent-test.git
   cd backend-agent-test
   ```

2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. Make your changes and test:
   ```bash
   javac src/Main.java
   java -cp src Main 1 2 3 4 5 3  # Test with sample data
   ```

#### Code Style Guidelines

- Use clear, descriptive variable names
- Follow Java naming conventions (camelCase for variables and methods)
- Add comments for complex logic
- Keep methods focused and concise
- Maintain consistent indentation (4 spaces)

#### Commit Messages

- Use the present tense ("Add feature" not "Added feature")
- Use the imperative mood ("Move cursor to..." not "Moves cursor to...")
- Limit the first line to 72 characters or less
- Reference issues and pull requests liberally after the first line

Example:
```
Fix binary search boundary condition

- Update while loop condition to use <= instead of <
- Add test cases for edge cases
- Resolves #123
```

### Testing

Before submitting a pull request:

1. Compile and test the code:
   ```bash
   javac src/Main.java
   java -cp src Main 1 2 3 4 5 3
   ```

2. Test edge cases:
   ```bash
   # Empty array
   java -cp src Main 5
   
   # Single element
   java -cp src Main 5 5
   
   # Target not found
   java -cp src Main 1 2 3 4 5 7
   ```

### Documentation

- Update README.md if you change functionality
- Add or update code comments for complex logic
- Update API documentation for new methods

## Getting Help

If you need help with contributing:

1. Check existing issues and discussions
2. Read our [SUPPORT.md](SUPPORT.md) file
3. Open a new issue with the "question" label

## Recognition

Contributors will be acknowledged in [AUTHORS.md](AUTHORS.md).

Thank you for contributing!