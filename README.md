# Backend Agent Test

A simple Java application that demonstrates basic console output and loop iteration.

## Description

This is a basic Java program that:
- Prints a welcome message to the console
- Demonstrates a simple for loop by printing numbers 1 through 5
- Serves as a foundation for Java development and testing

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- This project was tested with OpenJDK 17

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .gitignore            # Git ignore file for Java projects
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## How to Compile and Run

### Option 1: Using command line

1. **Compile the program:**
   ```bash
   mkdir -p out
   javac src/Main.java -d out
   ```

2. **Run the program:**
   ```bash
   java -cp out Main
   ```

### Option 2: Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Right-click on `Main.java` and select "Run 'Main.main()'"
3. Or use the keyboard shortcut to run the application

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

This project is set up as an IntelliJ IDEA project with:
- Source files in the `src/` directory
- Standard Java project structure
- Appropriate `.gitignore` for Java development

## Contributing

Feel free to fork this repository and submit pull requests for any improvements.

## License

This project is provided as-is for educational and testing purposes.