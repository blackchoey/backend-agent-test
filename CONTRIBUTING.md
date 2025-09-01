# Contributing to Backend Agent Test

Thank you for your interest in contributing to this project! We welcome contributions from everyone.

## How to Contribute

### Reporting Issues

If you find a bug or have a suggestion for improvement:

1. Check if the issue already exists in our [issue tracker](https://github.com/blackchoey/backend-agent-test/issues)
2. If not, create a new issue with:
   - A clear and descriptive title
   - A detailed description of the problem or suggestion
   - Steps to reproduce (for bugs)
   - Expected vs actual behavior
   - Your environment details (Java version, OS, etc.)

### Submitting Changes

1. **Fork the repository**
   - Click the "Fork" button on GitHub
   - Clone your fork locally:
     ```bash
     git clone https://github.com/your-username/backend-agent-test.git
     cd backend-agent-test
     ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Make your changes**
   - Write clean, readable code
   - Follow existing code style and conventions
   - Add comments where necessary
   - Test your changes locally

4. **Test your changes**
   ```bash
   # Compile the code
   mkdir -p out
   javac src/Main.java -d out
   
   # Run the application
   java -cp out Main
   ```

5. **Commit your changes**
   ```bash
   git add .
   git commit -m "Brief description of your changes"
   ```

6. **Push to your fork**
   ```bash
   git push origin feature/your-feature-name
   ```

7. **Submit a Pull Request**
   - Go to the original repository on GitHub
   - Click "New Pull Request"
   - Select your feature branch
   - Provide a clear description of your changes

## Code Style Guidelines

- Use clear and descriptive variable names
- Add comments for complex logic
- Follow Java naming conventions:
  - Classes: PascalCase (`ClassName`)
  - Methods and variables: camelCase (`methodName`, `variableName`)
  - Constants: UPPER_SNAKE_CASE (`CONSTANT_NAME`)
- Keep lines under 120 characters when possible
- Use proper indentation (4 spaces)

## Development Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git
- Text editor or IDE (IntelliJ IDEA recommended)

### Local Development
1. Fork and clone the repository
2. Open the project in your preferred IDE
3. Make your changes
4. Test locally before submitting

## Types of Contributions

We welcome various types of contributions:

- **Bug fixes**: Help us identify and fix issues
- **Feature enhancements**: Add new functionality
- **Documentation improvements**: Update or add documentation
- **Code optimization**: Improve performance or readability
- **Tests**: Add or improve test coverage

## Pull Request Guidelines

- Keep pull requests focused on a single issue or feature
- Write clear commit messages
- Include a description of what your changes do
- Reference any related issues in your PR description
- Be prepared to address feedback and make revisions

## Questions?

If you have questions about contributing, feel free to:
- Open an issue with the "question" label
- Contact the maintainers through GitHub

## Code of Conduct

This project follows our [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you agree to abide by its terms.

## License

By contributing to this project, you agree that your contributions will be licensed under the same [MIT License](LICENSE) that covers the project.