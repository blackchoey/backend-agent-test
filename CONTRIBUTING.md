# Contributing to Backend Agent Test

We welcome contributions to this project! This document will help you get started.

## Development Setup

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Git

### Getting Started

1. **Fork the repository** on GitHub
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```

3. **Build the project**:
   ```bash
   mvn clean compile
   ```

4. **Run tests** to make sure everything works:
   ```bash
   mvn test
   ```

5. **Run the application**:
   ```bash
   mvn exec:java -Dexec.mainClass="Main"
   ```

## Making Changes

### Before You Start

- Create a new branch for your feature/fix:
  ```bash
  git checkout -b feature/your-feature-name
  ```

### Coding Standards

- Follow Java naming conventions
- Write clear, readable code with appropriate comments
- Ensure all tests pass before submitting
- Add tests for new functionality
- Keep changes focused and atomic

### Code Style

- Use 4 spaces for indentation
- Follow standard Java code formatting
- Maximum line length: 120 characters
- Use meaningful variable and method names

### Testing

- Write unit tests for new functionality
- Ensure all existing tests continue to pass
- Test coverage should not decrease with your changes
- Run tests locally before submitting:
  ```bash
  mvn test
  ```

## Submitting Changes

### Pull Request Process

1. **Update documentation** if needed
2. **Add or update tests** for your changes
3. **Ensure the build passes**:
   ```bash
   mvn clean compile test
   ```

4. **Commit your changes** with a clear message:
   ```bash
   git add .
   git commit -m "Add feature: brief description of what you did"
   ```

5. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

6. **Open a Pull Request** on GitHub with:
   - Clear title describing the change
   - Detailed description of what was changed and why
   - Reference any related issues

### Pull Request Guidelines

- **One feature per PR**: Keep pull requests focused on a single feature or fix
- **Write clear descriptions**: Explain what your PR does and why
- **Update documentation**: Include any necessary documentation updates
- **Add tests**: New functionality should include appropriate tests
- **Keep commits clean**: Use meaningful commit messages

## Reporting Issues

### Bug Reports

When reporting bugs, please include:

- **Clear title** describing the issue
- **Steps to reproduce** the problem
- **Expected behavior** vs actual behavior
- **Environment details** (Java version, OS, etc.)
- **Code examples** if applicable

### Feature Requests

When suggesting features, please include:

- **Clear description** of the proposed feature
- **Use case** explaining why this would be valuable
- **Implementation ideas** if you have them

## Code of Conduct

Please note that this project is released with a [Code of Conduct](CODE_OF_CONDUCT.md). By participating in this project you agree to abide by its terms.

## Questions?

If you have questions about contributing, feel free to:

- Open an issue for discussion
- Reach out to the maintainers

Thank you for contributing! 🎉