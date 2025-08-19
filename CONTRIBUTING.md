# Contributing to Backend Agent Test

We welcome contributions to the Backend Agent Test project! This document provides guidelines for contributing.

## How to Contribute

### Reporting Issues

1. Check if the issue already exists in the [GitHub Issues](https://github.com/blackchoey/backend-agent-test/issues)
2. If not, create a new issue with:
   - Clear description of the problem
   - Steps to reproduce
   - Expected vs actual behavior
   - Java version and OS information

### Submitting Changes

1. Fork the repository
2. Create a feature branch from `main`:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Make your changes
4. Add tests for new functionality
5. Ensure all tests pass:
   ```bash
   mvn test
   ```
6. Commit your changes with clear commit messages
7. Push to your fork and submit a pull request

### Pull Request Guidelines

- Provide a clear description of the changes
- Reference any related issues
- Ensure all CI checks pass
- Keep changes focused and atomic
- Follow the existing code style

### Code Style

- Use standard Java conventions
- Add JavaDoc comments for public methods
- Keep methods small and focused
- Use meaningful variable and method names

### Testing

- Write unit tests for new functionality
- Ensure existing tests continue to pass
- Aim for good test coverage

## Development Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   ```

2. Build the project:
   ```bash
   mvn compile
   ```

3. Run tests:
   ```bash
   mvn test
   ```

4. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="Main"
   ```

## Questions?

If you have questions about contributing, please open an issue or reach out to the maintainers.

Thank you for contributing!