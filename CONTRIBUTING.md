# Contributing to Backend Agent Test

Thank you for your interest in contributing to this project! We welcome contributions from everyone.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Git

### Setting up your development environment

1. Fork the repository on GitHub
2. Clone your fork locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
   cd backend-agent-test
   ```
3. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```

## Development Process

### Building the Project

```bash
mvn compile
```

### Running the Application

```bash
mvn exec:java -Dexec.mainClass="Main"
```

### Running Tests

```bash
mvn test
```

## Contributing Guidelines

### Code Style

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Keep methods focused and concise
- Add comments for complex logic

### Commit Messages

- Use clear and descriptive commit messages
- Start with a verb in the present tense (e.g., "Add", "Fix", "Update")
- Keep the first line under 50 characters
- Provide more details in the body if necessary

Example:
```
Add user authentication feature

- Implement login/logout functionality
- Add password validation
- Include unit tests for auth methods
```

### Pull Request Process

1. Ensure your code builds successfully
2. Run all tests and ensure they pass
3. Update documentation if necessary
4. Create a clear pull request description explaining:
   - What changes you made
   - Why you made them
   - How to test the changes

### Testing

- Write unit tests for new functionality
- Ensure all existing tests still pass
- Test edge cases and error conditions

## Code of Conduct

This project follows our [Code of Conduct](CODE_OF_CONDUCT.md). Please read it before contributing.

## Reporting Issues

If you find a bug or have a feature request:

1. Check if the issue already exists in our [issue tracker](https://github.com/blackchoey/backend-agent-test/issues)
2. If not, create a new issue with:
   - A clear title and description
   - Steps to reproduce (for bugs)
   - Expected vs actual behavior
   - Your environment details (OS, Java version, etc.)

## Getting Help

If you need help:

- Check the project documentation in the `docs/` directory
- Look through existing issues and pull requests
- Create a new issue with the "question" label

## Recognition

Contributors will be recognized in our README.md file and release notes.

Thank you for contributing!