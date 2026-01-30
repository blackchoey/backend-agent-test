# Contributing to Backend Agent Test

Thank you for your interest in contributing to the Backend Agent Test project! This document provides guidelines and instructions for contributing.

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
- [Getting Started](#getting-started)
- [Development Process](#development-process)
- [Coding Standards](#coding-standards)
- [Submitting Changes](#submitting-changes)

## Code of Conduct

This project and everyone participating in it is governed by our [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code. Please report unacceptable behavior to the project maintainers.

## How Can I Contribute?

### Reporting Bugs

Before creating bug reports, please check the [issue tracker](https://github.com/blackchoey/backend-agent-test/issues) to see if the problem has already been reported. If you're unable to find an open issue addressing the problem, [open a new one](https://github.com/blackchoey/backend-agent-test/issues/new).

When creating a bug report, include as many details as possible:

- **Use a clear and descriptive title**
- **Describe the exact steps to reproduce the problem**
- **Provide specific examples** (code snippets, command-line commands)
- **Describe the behavior you observed** and what you expected to see
- **Include relevant details** about your environment (Java version, OS, etc.)

### Suggesting Enhancements

Enhancement suggestions are tracked as GitHub issues. When creating an enhancement suggestion:

- **Use a clear and descriptive title**
- **Provide a detailed description** of the suggested enhancement
- **Explain why this enhancement would be useful** to most users
- **List any similar features** in other projects, if applicable

### Code Contributions

We welcome code contributions! Here's how to get started:

## Getting Started

1. **Fork the repository** on GitHub
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/YOUR-USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```
3. **Create a branch** for your changes:
   ```bash
   git checkout -b feature/your-feature-name
   ```

## Development Process

1. **Make your changes** in your feature branch
2. **Test your changes** thoroughly:
   - Compile the code: `javac src/Main.java`
   - Run the application with various test cases
   - Verify edge cases and error handling
3. **Commit your changes** with clear, descriptive commit messages:
   ```bash
   git commit -m "Add feature: brief description"
   ```

## Coding Standards

Please follow these coding standards when contributing:

### Java Style Guidelines

- **Indentation**: Use 4 spaces (no tabs)
- **Naming Conventions**:
  - Classes: PascalCase (e.g., `Main`, `BinarySearch`)
  - Methods: camelCase (e.g., `binarySearch`, `findElement`)
  - Variables: camelCase (e.g., `targetValue`, `leftIndex`)
  - Constants: UPPER_SNAKE_CASE (e.g., `MAX_SIZE`, `DEFAULT_VALUE`)
- **Braces**: Use K&R style (opening brace on same line)
- **Comments**: 
  - Use JavaDoc comments for public methods and classes
  - Use inline comments sparingly and only when necessary
  - Keep comments up-to-date with code changes

### Code Quality

- Write clear, self-documenting code
- Keep methods focused and single-purpose
- Avoid code duplication
- Handle edge cases and errors appropriately
- Add appropriate error messages and logging

### Example

```java
/**
 * Performs binary search on a sorted array.
 * 
 * @param arr The sorted array to search
 * @param target The value to find
 * @return The index of the target value, or -1 if not found
 */
public static int binarySearch(int[] arr, int target) {
    // Implementation here
}
```

## Submitting Changes

1. **Push your changes** to your fork:
   ```bash
   git push origin feature/your-feature-name
   ```
2. **Open a Pull Request** on GitHub:
   - Go to the original repository
   - Click "New Pull Request"
   - Select your fork and branch
   - Fill in the PR template with:
     - Clear title describing the change
     - Detailed description of what changed and why
     - Reference to any related issues (e.g., "Fixes #123")
     - List of testing performed

3. **Respond to feedback**:
   - Address any review comments
   - Make requested changes in your branch
   - Push updates (they'll automatically appear in the PR)

## Pull Request Review Process

- Maintainers will review your PR as soon as possible
- You may be asked to make changes or provide clarification
- Once approved, a maintainer will merge your PR
- Your contribution will be acknowledged in the project

## Questions?

If you have questions or need help, feel free to:
- Open an issue with the "question" label
- Reach out to the maintainers
- Check existing documentation

Thank you for contributing to Backend Agent Test! 🎉
