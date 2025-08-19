# Contributing to Backend Agent Test

Thank you for your interest in contributing to this project! Here are some guidelines to help you get started.

## Development Process

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

## Building and Testing

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Building the project
```bash
mvn clean compile
```

### Running tests
```bash
mvn test
```

### Running the application
```bash
mvn exec:java -Dexec.mainClass="Main"
```

## Code Style

- Follow standard Java naming conventions
- Write clear, readable code with appropriate comments
- Include tests for new functionality
- Ensure all tests pass before submitting

## Submitting Changes

1. **Commit your changes** with a clear commit message:
   ```bash
   git commit -m "Add feature: description of what you added"
   ```

2. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

3. **Create a Pull Request** on GitHub:
   - Give your PR a clear title and description
   - Link to any relevant issues
   - Ensure all CI checks pass

## Pull Request Guidelines

- Keep PRs focused on a single feature or fix
- Include tests for new functionality
- Update documentation if necessary
- Ensure your code follows the existing style
- Write clear commit messages

## Reporting Issues

When reporting issues, please include:
- A clear description of the problem
- Steps to reproduce the issue
- Expected vs actual behavior
- Your environment (Java version, OS, etc.)

## Code Review Process

- All submissions require review before merging
- Maintainers will provide feedback and suggestions
- Be responsive to feedback and ready to make changes
- CI checks must pass before merging

## Questions?

Feel free to open an issue for any questions about contributing!

Thank you for contributing! 🎉