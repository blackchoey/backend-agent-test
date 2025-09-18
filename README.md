# Backend Agent Test

A simple Java application demonstrating basic Java programming concepts with a "Hello World" program that includes a loop for educational purposes.

## Description

This project contains a basic Java application that prints a welcome message and demonstrates a simple for loop by counting from 1 to 5. It's designed as a starting point for Java development and can be used for testing backend development workflows.

## Prerequisites

Before running this application, make sure you have the following installed:

- **Java Development Kit (JDK)** 8 or higher
  - You can check your Java version by running: `java -version`
  - You can check your Java compiler version by running: `javac -version`

## Project Structure

```
backend-agent-test/
├── .gitignore          # Git ignore file for Java projects
├── .idea/              # IntelliJ IDEA configuration files
├── src/                # Source code directory
│   └── Main.java       # Main Java application file
├── test.iml            # IntelliJ IDEA module file
└── README.md           # This file
```

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **No additional dependencies required** - this is a pure Java application using only the standard library.

## Usage

### Compile and Run

1. **Compile the Java source code:**
   ```bash
   javac src/Main.java
   ```

2. **Run the compiled program:**
   ```bash
   java -cp src Main
   ```

### Expected Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

### Using an IDE

This project is configured for **IntelliJ IDEA**:

1. Open IntelliJ IDEA
2. Choose "Open" and select the project directory
3. The IDE will automatically recognize the project structure
4. You can run the program by:
   - Right-clicking on `Main.java` and selecting "Run 'Main.main()'"
   - Or using the keyboard shortcut configured in your IDE
   - Or clicking the green run button in the gutter

## Development

### Code Structure

- **Main.java**: Contains the main application logic
  - `main()` method: Entry point of the application
  - Prints a welcome message
  - Demonstrates a for loop counting from 1 to 5

### Modifying the Code

Feel free to modify the code to:
- Change the welcome message
- Adjust the loop range (currently 1 to 5)
- Add additional functionality
- Practice Java programming concepts

## Building and Testing

### Manual Testing

To verify the application works correctly:

1. Compile and run as described in the Usage section
2. Verify the output matches the expected output shown above
3. Make sure there are no compilation errors

### IDE Testing

If using IntelliJ IDEA:
- The project includes debugging configurations
- You can set breakpoints and step through the code
- Use the built-in run configurations for easy testing

## Contributing

This is a simple test project, but contributions are welcome:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a Pull Request

## License

This project is a simple educational example. Feel free to use it for learning and testing purposes.

## Troubleshooting

### Common Issues

**Compilation Error**: `javac: command not found`
- Make sure JDK is installed and added to your PATH

**Runtime Error**: `java: command not found`
- Make sure Java runtime is installed and added to your PATH

**Class Not Found Error**: `Error: Could not find or load main class Main`
- Make sure you're running the command from the correct directory
- Verify the classpath is set correctly with `-cp src`

**IDE Issues**:
- If IntelliJ IDEA doesn't recognize the project structure, try refreshing the project or reimporting it
- Make sure your Project SDK is set to a compatible Java version

## Contact

For questions or issues, please open an issue in the GitHub repository.