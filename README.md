# Backend Agent Test

A simple Java application that demonstrates basic console output and iteration. This project serves as a foundational template for Java development and testing.

## Description

This application prints a welcome message followed by a numbered list from 1 to 5. It's designed as a starting point for Java development and can be extended for more complex backend functionalities.

## Features

- Simple console-based "Hello World" implementation
- Demonstrates basic loop iteration
- Clean, minimal code structure
- IntelliJ IDEA project configuration included

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA recommended) or text editor
- Command line access for compilation and execution

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test
```

### Compile and Run

#### Using Command Line

1. Compile the Java source file:
   ```bash
   javac src/Main.java
   ```

2. Run the compiled program:
   ```bash
   java -cp src Main
   ```

#### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green run arrow or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (macOS)

### Expected Output

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Project Structure

```
backend-agent-test/
├── .idea/                 # IntelliJ IDEA project settings
├── src/
│   └── Main.java         # Main application class
├── .gitignore            # Git ignore file
├── CONTRIBUTING.md       # Contribution guidelines
├── README.md             # This file
└── test.iml              # IntelliJ IDEA module file
```

## Code Overview

The main application consists of a single class `Main` with the following functionality:

- **Welcome Message**: Prints "Hello and welcome!" to the console
- **Number Iteration**: Uses a for loop to print numbers 1 through 5
- **Console Output**: Demonstrates both `System.out.printf()` and `System.out.println()` methods

## Development

### Adding New Features

To extend this application:

1. Create new classes in the `src/` directory
2. Follow Java naming conventions (PascalCase for classes, camelCase for methods)
3. Update this README with new functionality

### Code Style

- Use standard Java naming conventions
- Include comments for complex logic
- Keep methods small and focused
- Follow the existing indentation pattern (4 spaces)

## Contributing

We welcome contributions to the Backend Agent Test project! Whether you're fixing bugs, adding features, improving documentation, or reporting issues, your help is appreciated.

### How to Contribute

#### 1. Fork and Clone
```bash
# Fork the repository on GitHub, then clone your fork
git clone https://github.com/YOUR_USERNAME/backend-agent-test.git
cd backend-agent-test
```

#### 2. Create a Branch
```bash
# Create a new branch for your feature or bugfix
git checkout -b feature/your-feature-name
# or
git checkout -b bugfix/your-bugfix-name
```

#### 3. Make Your Changes
- Follow the existing code style and conventions
- Test your changes thoroughly
- Update documentation if needed
- Keep commits focused and atomic

#### 4. Test Your Changes
```bash
# Compile and test the application
javac src/Main.java
java -cp src Main
```

#### 5. Commit and Push
```bash
# Stage your changes
git add .

# Commit with a descriptive message
git commit -m "Add: brief description of your changes"

# Push to your fork
git push origin feature/your-feature-name
```

#### 6. Create a Pull Request
- Go to the original repository on GitHub
- Click "New Pull Request"
- Select your branch and provide a clear description
- Wait for review and address any feedback

### Development Guidelines

#### Code Style
- Use 4 spaces for indentation
- Follow Java naming conventions:
  - Classes: `PascalCase`
  - Methods and variables: `camelCase`
  - Constants: `UPPER_CASE`
- Add comments for complex logic
- Keep methods small and focused

#### Commit Messages
- Use the imperative mood ("Add feature" not "Added feature")
- Keep the first line under 50 characters
- Reference issues when applicable: "Fix #123: description"

#### Pull Request Guidelines
- Provide a clear title and description
- Include steps to test your changes
- Link to related issues
- Be responsive to feedback and suggestions

For more detailed contribution guidelines, see [CONTRIBUTING.md](CONTRIBUTING.md).

## License

This project is open source and available under the [MIT License](LICENSE).

## Contact

- GitHub: [@blackchoey](https://github.com/blackchoey)
- Repository: [backend-agent-test](https://github.com/blackchoey/backend-agent-test)