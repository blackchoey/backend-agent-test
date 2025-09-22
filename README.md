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
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
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

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).

## Contact

- GitHub: [@blackchoey](https://github.com/blackchoey)
- Repository: [backend-agent-test](https://github.com/blackchoey/backend-agent-test)