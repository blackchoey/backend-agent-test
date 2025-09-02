# Backend Agent Test

A simple Java application demonstrating basic programming concepts including console output and loop iteration.

## Description

This project contains a simple Java program that serves as a basic "Hello World" application with additional loop functionality. The program prints a welcome message and then displays numbers from 1 to 5 in a loop.

## Features

- Console output demonstration
- Basic for-loop implementation
- Simple Java application structure

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command line terminal or Java IDE

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application file
├── .gitignore            # Git ignore file for Java projects
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## How to Run

### Using Command Line

1. **Compile the application:**
   ```bash
   javac src/Main.java -d out
   ```

2. **Run the application:**
   ```bash
   java -cp out Main
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Right-click and select "Run 'Main.main()'" or press `Ctrl+Shift+F10`

## Expected Output

When you run the application, you should see the following output:

```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

This project uses standard Java development practices:

- Source code is located in the `src/` directory
- The main class contains the application entry point
- Output files are compiled to the `out/` directory (excluded from version control)

## Contributing

This is a test project for backend agent functionality. Feel free to fork and experiment with the code.

## License

This project is provided as-is for educational and testing purposes.