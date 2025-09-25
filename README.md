# Backend Agent Test

A simple Java application that demonstrates basic Java programming concepts including loops and console output.

## Description

This project contains a simple Java program that:
- Prints a welcome message to the console
- Demonstrates a basic for loop that iterates from 1 to 5
- Shows how to use `System.out.printf()` and `System.out.println()` for console output

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java-compatible IDE (IntelliJ IDEA recommended) or command line tools

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application entry point
├── .idea/                 # IntelliJ IDEA project files
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Getting Started

### Running with Command Line

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Compile the Java source code:
   ```bash
   javac src/Main.java
   ```

3. Run the compiled program:
   ```bash
   java -cp src Main
   ```

### Running with IntelliJ IDEA

1. Open IntelliJ IDEA
2. Open the project by selecting the repository folder
3. Navigate to `src/Main.java`
4. Click the green run button or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (Mac)

## Expected Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Features

- Simple console-based Java application
- Demonstrates basic programming constructs:
  - String output formatting
  - For loops
  - Console I/O operations

## Development

This project is configured as an IntelliJ IDEA project with:
- Source files in the `src/` directory
- Standard Java module configuration
- Gitignore rules for common Java build artifacts

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test your changes
5. Submit a pull request

## License

This project is provided as-is for educational and testing purposes.