# Contributing to Backend Agent Test

Thank you for your interest in contributing to this project! We welcome contributions from everyone.

## How to Contribute

### Reporting Issues

- Use the GitHub issue tracker to report bugs
- Clearly describe the issue including steps to reproduce
- Include the version of Java you're using
- Include any relevant error messages or logs

### Suggesting Features

- Use GitHub issues to suggest new features
- Clearly describe the feature and its use case
- Explain how it would benefit the project

### Code Contributions

1. **Fork the Repository**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Create a Feature Branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Make Your Changes**
   - Write clean, readable code
   - Follow the existing code style
   - Add tests for new functionality
   - Update documentation as needed

4. **Test Your Changes**
   ```bash
   mvn clean test
   mvn exec:java -Dexec.mainClass="Main"
   ```

5. **Commit Your Changes**
   ```bash
   git add .
   git commit -m "Add: brief description of your changes"
   ```

6. **Push to Your Fork**
   ```bash
   git push origin feature/your-feature-name
   ```

7. **Create a Pull Request**
   - Use a clear and descriptive title
   - Provide a detailed description of your changes
   - Reference any related issues

## Code Style Guidelines

- Use 4 spaces for indentation
- Use meaningful variable and method names
- Add comments for complex logic
- Follow Java naming conventions
- Keep methods focused and concise

## Testing

- Write unit tests for new functionality
- Ensure all tests pass before submitting a PR
- Aim for good test coverage
- Use descriptive test names

## Development Setup

1. **Prerequisites**
   - Java 17 or higher
   - Maven 3.6 or higher
   - Git

2. **Building the Project**
   ```bash
   mvn clean compile
   ```

3. **Running Tests**
   ```bash
   mvn test
   ```

4. **Running the Application**
   ```bash
   mvn exec:java -Dexec.mainClass="Main"
   ```

## Code of Conduct

Please note that this project adheres to a basic code of conduct:

- Be respectful and inclusive
- Use welcoming and inclusive language
- Be collaborative
- Focus on what is best for the community
- Show empathy towards other community members

## Questions?

If you have questions about contributing, please open an issue and we'll help you get started.

Thank you for contributing!