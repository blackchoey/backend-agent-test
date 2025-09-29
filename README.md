# Backend Agent Test

A simple Java application for testing and learning purposes.

## Description

This is a basic Java program that demonstrates fundamental programming concepts including:
- Console output using `System.out.printf()` and `System.out.println()`
- For loops and iteration
- Basic program structure

The program outputs a welcome message followed by a count from 1 to 5.

## Features

- Simple console application
- No external dependencies
- Cross-platform compatibility
- Beginner-friendly code structure

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line access

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .gitignore             # Git ignore rules (excludes compiled files)
├── test.iml               # IntelliJ IDEA module file
└── README.md              # This file
```

## How to Build and Run

### Option 1: Command Line

1. **Compile the program:**
   ```bash
   javac src/Main.java
   ```

2. **Run the program:**
   ```bash
   java -cp src Main
   ```

3. **Clean up compiled files (optional):**
   ```bash
   rm src/Main.class
   ```

### Option 2: Using IntelliJ IDEA

1. Open the project directory in IntelliJ IDEA
2. The IDE will automatically recognize the module configuration
3. Run the `Main` class directly from the IDE by:
   - Right-clicking on `Main.java` and selecting "Run Main.main()"
   - Or using the keyboard shortcut shown in the IDE comments

### Expected Output:
```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Troubleshooting

- **Java not found**: Ensure Java is installed and available in your system PATH
- **Class not found**: Make sure you compiled the program first with `javac`
- **Permission denied**: On Unix systems, you may need to make the directory writable

## Development

This project is configured for development with IntelliJ IDEA, but can be built and run using any Java development environment or command line tools.

### Code Structure

The `Main.java` file contains:
- Entry point method `main(String[] args)`
- Basic console output demonstration
- Loop iteration example
- IntelliJ IDEA tips and shortcuts in comments

## Contributing

This is a test repository. Feel free to experiment with modifications to learn Java programming concepts.

## License

This project is for educational and testing purposes.