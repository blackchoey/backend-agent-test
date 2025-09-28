# Contributing to Backend Agent Test

Thank you for your interest in contributing to this project! We welcome contributions from everyone.

## How to Contribute

### Reporting Issues

1. Check if the issue already exists in the [Issues](https://github.com/blackchoey/backend-agent-test/issues) section
2. If not, create a new issue with:
   - A clear and descriptive title
   - A detailed description of the problem
   - Steps to reproduce the issue
   - Expected vs actual behavior
   - Your environment details (Java version, OS, etc.)

### Submitting Changes

1. **Fork the repository** to your GitHub account
2. **Create a new branch** for your feature or bug fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make your changes** following the coding standards below
4. **Test your changes** thoroughly
5. **Commit your changes** with a clear commit message:
   ```bash
   git commit -m "Add: brief description of your changes"
   ```
6. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```
7. **Create a Pull Request** with:
   - A clear title and description
   - Reference to any related issues
   - Screenshots or examples if applicable

## Coding Standards

### Java Code Style
- Use 4 spaces for indentation (no tabs)
- Follow Java naming conventions:
  - Classes: `PascalCase`
  - Methods and variables: `camelCase`
  - Constants: `UPPER_SNAKE_CASE`
- Add meaningful comments for complex logic
- Keep methods focused and concise
- Use descriptive variable and method names

### Code Quality
- Ensure your code compiles without warnings
- Test your changes before submitting
- Follow existing code patterns in the project
- Remove any debugging code or console logs

## Development Setup

1. Ensure you have Java 17 or higher installed
2. Clone your fork locally
3. Open the project in your preferred IDE or use command line tools
4. Compile and run the application to verify setup:
   ```bash
   mkdir -p out
   javac src/Main.java -d out
   java -cp out Main
   ```

## Pull Request Process

1. Ensure your PR description clearly describes the problem and solution
2. Reference any related issue numbers
3. Make sure all tests pass
4. Be responsive to feedback and questions
5. Maintain your PR by rebasing if needed

## Code of Conduct

This project adheres to a [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code.

## Questions?

If you have questions about contributing, feel free to:
- Open an issue for discussion
- Contact the maintainers through GitHub

Thank you for contributing! 🎉