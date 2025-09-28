# Backend Agent Test

A simple Java application that demonstrates basic console output and loop functionality.

## Description

This is a basic Java project that prints a welcome message and counts from 1 to 5. It serves as a simple example of Java programming fundamentals including:

- Console output using `System.out.printf()` and `System.out.println()`
- For loop iteration
- Basic program structure with a main method

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt)

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application file
├── .gitignore            # Git ignore patterns
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Building and Running

### Using Command Line

1. **Compile the Java source code:**
   ```bash
   javac src/Main.java
   ```

2. **Run the compiled program:**
   ```bash
   java -cp src Main
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the run button (▶️) in the gutter next to the `main` method
4. Or use the keyboard shortcut for running code

## Expected Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

This project is set up as an IntelliJ IDEA project with the following configuration:
- Source folder: `src/`
- Module file: `test.iml`
- Java compilation output is excluded via `.gitignore`

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test your changes
5. Submit a pull request

## License

This project is for educational and testing purposes.