# Backend Agent Test

A simple Java application that demonstrates basic console output and loops. This project serves as a basic "Hello World" style program with additional functionality.

## Description

This application prints a welcome message and then displays a counting loop from 1 to 5. It's designed as a learning project or demonstration of basic Java programming concepts.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Command line access

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application file
├── .idea/                 # IntelliJ IDEA project configuration
├── .gitignore            # Git ignore rules for Java projects
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## How to Run

### Method 1: Using Command Line

1. Navigate to the project directory:
   ```bash
   cd backend-agent-test
   ```

2. Compile the Java source code:
   ```bash
   javac src/Main.java -d out
   ```

3. Run the compiled application:
   ```bash
   java -cp out Main
   ```

### Method 2: Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green arrow next to the `main` method or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (Mac)

## Expected Output

When you run the application, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Code Overview

The main application consists of:
- A welcome message printed using `System.out.printf()`
- A for loop that iterates from 1 to 5
- Each iteration prints the current value of the loop variable

## Development

This project is configured for IntelliJ IDEA and uses Java 21 language features (though it's compatible with Java 17+). The project structure follows standard Java conventions with source code in the `src/` directory.

## License

This project is for educational and testing purposes.