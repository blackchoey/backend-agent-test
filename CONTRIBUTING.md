# Contributing to Backend Agent Test

Thank you for your interest in contributing to Backend Agent Test! This document provides guidelines and information for contributors.

## Code of Conduct

Please read and follow our [Code of Conduct](CODE_OF_CONDUCT.md) to ensure a welcoming environment for all contributors.

## How to Contribute

### Reporting Issues

1. Check existing issues to avoid duplicates
2. Use the issue templates when available
3. Provide clear, detailed descriptions
4. Include steps to reproduce for bugs
5. Mention your environment (Java version, OS, etc.)

### Submitting Changes

1. **Fork the repository**
2. **Create a feature branch** from `main`:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make your changes**:
   - Follow the existing code style
   - Add tests for new functionality
   - Update documentation as needed
4. **Test your changes**:
   ```bash
   mvn test
   mvn compile
   ```
5. **Commit your changes**:
   - Use clear, descriptive commit messages
   - Follow conventional commit format if possible
6. **Push and create a Pull Request**

### Code Style Guidelines

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Add comments for complex logic
- Keep methods focused and concise
- Ensure proper indentation (4 spaces)

### Testing

- Add unit tests for new features
- Ensure all tests pass before submitting
- Test edge cases and error conditions
- Maintain or improve code coverage

## Development Setup

1. **Prerequisites**:
   - Java 11 or higher
   - Maven 3.6+
   - Git

2. **Clone and setup**:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   mvn compile
   ```

3. **Run tests**:
   ```bash
   mvn test
   ```

## Pull Request Process

1. Update documentation for any new features
2. Add or update tests as appropriate
3. Ensure the PR description clearly describes the changes
4. Link any related issues
5. Request review from maintainers
6. Address any feedback promptly

## Questions?

Feel free to open an issue for questions about contributing, or reach out to the maintainers directly.

Thank you for contributing!