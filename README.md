# Backend Agent Test

A simple Java project designed for testing backend agent functionality. This project contains a basic "Hello World" application that demonstrates fundamental Java programming concepts.

## Description

This project contains a simple Java application that:
- Prints a welcome message
- Demonstrates a basic for loop by printing numbers 1 through 5
- Serves as a test case for backend development and agent testing

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Any text editor or IDE (IntelliJ IDEA project files are included)

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application file
├── .idea/                 # IntelliJ IDEA project configuration
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## How to Build

The project uses standard Java compilation. No build tools like Maven or Gradle are required.

### Compile the code:
```bash
javac src/Main.java -d out
```

This will compile the Java source code and place the compiled classes in the `out` directory.

## How to Run

After compilation, run the application with:

```bash
java -cp out Main
```

### Expected Output:
```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

### Using IntelliJ IDEA
1. Open the project directory in IntelliJ IDEA
2. The IDE will automatically recognize the project structure
3. Use the Run button or `Shift+F10` to run the application
4. Use the Debug button or `Shift+F9` to debug the application

### Using Command Line
1. Navigate to the project directory
2. Follow the build and run instructions above

## Features

- Simple console output demonstration
- Basic loop implementation
- Standard Java project structure
- Ready for IDE integration

## License

This is a test project for educational and development purposes.