# Backend Agent Test

A simple Java project that demonstrates basic console output and loop functionality.

## Description

This is a basic Java application that prints a welcome message followed by a numbered loop from 1 to 5. It serves as a simple test project for backend development practices.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java-compatible IDE (IntelliJ IDEA recommended, as project files are included)

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .idea/                 # IntelliJ IDEA project files
├── .gitignore            # Git ignore configuration
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## How to Compile and Run

### Using Command Line

1. **Compile the project:**
   ```bash
   javac src/Main.java -d out/
   ```

2. **Run the compiled program:**
   ```bash
   java -cp out Main
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green "Run" button or press `Shift + F10`

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

- Simple console application
- Demonstrates basic Java syntax
- Includes loop iteration with counter display
- Ready-to-use IntelliJ IDEA project configuration

## Development

This project is set up as an IntelliJ IDEA project with:
- Source files in the `src/` directory
- Output directory configured to `out/`
- Standard Java module configuration

## License

This project is for testing and educational purposes.