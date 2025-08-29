# Contributing to Backend Agent Test

Thank you for your interest in contributing to Backend Agent Test! We welcome contributions from everyone.

## Code of Conduct

By participating in this project, you agree to abide by our [Code of Conduct](CODE_OF_CONDUCT.md).

## How to Contribute

### Reporting Issues

Before creating a new issue, please:

1. Check the [existing issues](https://github.com/blackchoey/backend-agent-test/issues) to avoid duplicates
2. Use a clear and descriptive title
3. Provide as much relevant information as possible
4. Include steps to reproduce the issue if applicable

### Submitting Changes

1. **Fork the repository** on GitHub
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```

3. **Create a feature branch** from `main`:
   ```bash
   git checkout -b feature/your-feature-name
   ```

4. **Make your changes** following our coding standards
5. **Test your changes**:
   ```bash
   mvn clean test
   ```

6. **Commit your changes** with a clear commit message:
   ```bash
   git commit -m "Add feature: description of what you added"
   ```

7. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

8. **Submit a Pull Request** on GitHub

## Development Setup

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Git

### Setting up the development environment

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

3. Run tests:
   ```bash
   mvn test
   ```

4. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.Main"
   ```

## Coding Standards

- Follow Java naming conventions
- Write clear, self-documenting code
- Add JavaDoc comments for public methods and classes
- Write unit tests for new functionality
- Ensure all tests pass before submitting

## Pull Request Guidelines

- Fill in the pull request template completely
- Include a clear description of the changes
- Reference any related issues
- Ensure CI checks pass
- Keep changes focused and atomic
- Update documentation if necessary

## Testing

All contributions should include appropriate tests:

- Unit tests for new functionality
- Integration tests for complex features
- Ensure existing tests continue to pass

Run the full test suite with:
```bash
mvn clean test
```

## Documentation

When adding new features:

- Update the README.md if necessary
- Add JavaDoc comments for public APIs
- Update any relevant documentation

## Getting Help

If you need help with anything related to contributing:

1. Check the [documentation](README.md)
2. Look at [existing issues](https://github.com/blackchoey/backend-agent-test/issues)
3. Create a new issue with the `question` label

Thank you for contributing! 🎉