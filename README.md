# Backend Agent Test

A simple Java "Hello World" application that demonstrates basic Java programming concepts including loops and console output.

## Description

This project contains a basic Java application that:
- Prints a welcome message
- Demonstrates a simple for loop by counting from 1 to 5
- Shows basic Java syntax and structure

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java-compatible IDE (IntelliJ IDEA recommended, as project files are included)

## How to Run

### Using Command Line

1. **Compile the application:**
   ```bash
   javac src/Main.java
   ```

2. **Run the application:**
   ```bash
   cd src
   java Main
   ```

### Using IntelliJ IDEA

1. Open the project directory in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Right-click and select "Run 'Main.main()'" or use the green arrow button

## Expected Output

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Project Structure

```
.
├── .idea/              # IntelliJ IDEA project files
├── src/                # Source code directory
│   └── Main.java       # Main application file
├── .gitignore          # Git ignore file
├── test.iml            # IntelliJ module file
└── README.md           # This file
```

## Code Overview

The `Main.java` file contains:
- A `main` method that serves as the entry point
- A simple printf statement for the welcome message
- A for loop that iterates 5 times and prints the loop counter

This is a beginner-friendly example perfect for learning Java basics or testing development environments.