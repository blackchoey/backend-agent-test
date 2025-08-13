# Java Hello World Project

A simple Java "Hello World" application that demonstrates basic Java programming concepts including console output and loops. This project is perfect for beginners learning Java programming or for testing Java development environments.

## Description

This project contains a basic Java application that:
- Displays a welcome message to the console
- Demonstrates a simple for loop by printing numbers 1 through 5
- Serves as a foundation for learning Java programming fundamentals

## Prerequisites

To compile and run this project, you need:

- **Java Development Kit (JDK) 8 or higher**
  - This project has been tested with OpenJDK 17
  - You can download the latest JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- **Command line interface** (Terminal, Command Prompt, or PowerShell)

### Verify Java Installation

Check if Java is properly installed by running:
```bash
java -version
javac -version
```

## Project Structure

```
backend-agent-test/
│
├── src/
│   └── Main.java          # Main Java source file containing the application logic
├── .gitignore            # Git ignore file for Java projects
├── .idea/                # IntelliJ IDEA configuration files
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This documentation file
```

## How to Compile and Run

### Step 1: Navigate to the Project Directory
```bash
cd backend-agent-test
```

### Step 2: Compile the Java Source Code
```bash
javac src/Main.java
```

This command compiles the `Main.java` file and creates a `Main.class` file in the `src/` directory.

### Step 3: Run the Compiled Program
```bash
java -cp src Main
```

This command runs the compiled Java program using the classpath pointing to the `src/` directory.

### Alternative: One-Line Compilation and Execution
```bash
javac src/Main.java && java -cp src Main
```

## Expected Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Code Explanation

The `Main.java` file contains:

1. **Package Declaration**: None (default package)
2. **Main Class**: `public class Main`
3. **Main Method**: The entry point of the Java application
4. **Console Output**: Uses `System.out.printf()` to print the welcome message
5. **For Loop**: Iterates from 1 to 5, printing each number with formatting

### Key Java Concepts Demonstrated

- **Class Declaration**: Defining a public class
- **Main Method**: The standard entry point for Java applications
- **Console Output**: Using `System.out.printf()` and `System.out.println()`
- **For Loops**: Basic iteration and loop control
- **String Formatting**: Displaying formatted output to the console

## Development Environment

This project was created using IntelliJ IDEA, as evidenced by the `.idea/` directory and `test.iml` file. However, it can be developed and run using any Java IDE or text editor with command-line compilation.

### Recommended IDEs
- IntelliJ IDEA (Community or Ultimate)
- Eclipse IDE
- Visual Studio Code with Java extensions
- NetBeans

## Troubleshooting

### Common Issues

1. **"javac is not recognized"**: Ensure the JDK is properly installed and added to your system's PATH environment variable.

2. **"Could not find or load main class Main"**: Make sure you're running the `java` command from the correct directory and using the proper classpath (`-cp src`).

3. **Compilation errors**: Verify that the `Main.java` file is in the `src/` directory and hasn't been modified.

### Getting Help

If you encounter issues:
1. Verify your Java installation with `java -version`
2. Check that you're in the correct directory
3. Ensure the file path is correct (`src/Main.java`)
4. Try cleaning up by deleting any `.class` files and recompiling

## Next Steps

Once you have this basic program running, you can:
- Modify the welcome message
- Change the loop range or add more loops
- Add user input functionality using `Scanner`
- Explore more Java programming concepts
- Create additional classes and methods

## License

This is a simple educational project. Feel free to use, modify, and distribute as needed for learning purposes.