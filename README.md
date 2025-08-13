# Java Hello World Project

A simple Java "Hello World" program designed for beginners learning Java programming. This project demonstrates basic Java syntax, console output, and loop structures.

## Description

This is a beginner-friendly Java project that showcases fundamental programming concepts:
- Basic console output using `System.out.printf()` and `System.out.println()`
- For loop implementation
- Simple program structure with a main method

The program prints a welcome message followed by a numbered sequence from 1 to 5.

## Prerequisites

Before running this project, make sure you have:

- **Java Development Kit (JDK) 8 or higher** installed on your system
  - To check your Java version, run: `java --version`
  - To check your Java compiler version, run: `javac --version`
- A terminal or command prompt to run commands
- (Optional) IntelliJ IDEA IDE for development (this project includes IntelliJ configuration files)

### Installing Java

If you don't have Java installed:

- **Windows/Mac/Linux**: Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- **Ubuntu/Debian**: `sudo apt install default-jdk`
- **macOS with Homebrew**: `brew install openjdk`

## How to Compile and Run

### Method 1: Using Command Line

1. **Clone or download the project** (if you haven't already)

2. **Navigate to the project directory**:
   ```bash
   cd path/to/your/project
   ```

3. **Compile the Java program**:
   ```bash
   javac src/Main.java -d out
   ```
   This creates a `Main.class` file in the `out` directory.

4. **Run the compiled program**:
   ```bash
   java -cp out Main
   ```

### Method 2: Using IntelliJ IDEA

1. **Open the project** in IntelliJ IDEA
2. **Navigate to** `src/Main.java`
3. **Right-click** on the file and select "Run 'Main.main()'"
4. **Or use the shortcut**: Click the green play button next to the `main` method

## Expected Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

**Note**: The welcome message and the first loop iteration appear on the same line because `System.out.printf()` doesn't add a newline character.

## Project Structure

```
test/
├── .gitignore              # Git ignore file for IDE and build artifacts
├── .idea/                  # IntelliJ IDEA configuration directory
│   └── .gitignore         # Additional git ignore for IDEA files
├── test.iml               # IntelliJ IDEA module file
├── src/                   # Source code directory
│   └── Main.java          # Main Java program file
├── out/                   # Compiled class files (created after compilation)
│   └── Main.class         # Compiled Java bytecode (after running javac)
└── README.md              # This documentation file
```

### File Descriptions

- **`src/Main.java`**: Contains the main Java program with the Hello World code and for loop
- **`test.iml`**: IntelliJ IDEA module configuration file that defines the project structure
- **`.gitignore`**: Specifies files and directories that Git should ignore (build artifacts, IDE files, etc.)
- **`.idea/`**: IntelliJ IDEA project configuration directory

## Code Explanation

The `Main.java` file contains:

```java
public class Main {
    public static void main(String[] args) {
        // Prints welcome message (no newline)
        System.out.printf("Hello and welcome!");

        // Loop from 1 to 5 and print each number
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
```

**Key concepts demonstrated:**
- **Class declaration**: `public class Main`
- **Main method**: Entry point of the Java program
- **Console output**: Using `printf` (no newline) and `println` (with newline)
- **For loop**: Iterating from 1 to 5 with increment
- **String concatenation**: Combining text and numbers

## Troubleshooting

### Common Issues

1. **"javac is not recognized"**: Java JDK is not installed or not in your system PATH
   - Solution: Install JDK and ensure it's in your system PATH

2. **"Error: Could not find or load main class Main"**: Class file not found
   - Solution: Make sure you compiled with `-d out` and are running with `-cp out Main`

3. **"java.lang.ClassNotFoundException"**: Classpath issue
   - Solution: Ensure you're in the correct directory and using the right classpath

### Getting Help

If you encounter issues:
1. Check that Java is properly installed: `java --version`
2. Verify the compilation step completed without errors
3. Ensure you're in the correct directory when running commands

## Contributing

This is a learning project, but contributions are welcome! Here's how you can contribute:

### Ways to Contribute

1. **Report bugs** or suggest improvements by opening an issue
2. **Improve documentation** - make the README clearer or add examples
3. **Add comments** to the code to make it more educational
4. **Create additional examples** based on this simple structure

### How to Contribute

1. **Fork** the repository
2. **Create a new branch** for your feature: `git checkout -b feature/your-feature-name`
3. **Make your changes** and test them
4. **Commit your changes**: `git commit -m "Add your descriptive commit message"`
5. **Push to your branch**: `git push origin feature/your-feature-name`
6. **Create a Pull Request** describing your changes

### Code Style Guidelines

- Follow standard Java naming conventions
- Add comments for educational purposes
- Keep code simple and beginner-friendly
- Test any changes to ensure they work correctly

## Learning Resources

If you're new to Java, here are some helpful resources:

- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Java Documentation](https://docs.oracle.com/en/java/)
- [IntelliJ IDEA Getting Started Guide](https://www.jetbrains.com/help/idea/getting-started.html)

## License

This project is provided as-is for educational purposes. Feel free to use, modify, and distribute for learning.

## Acknowledgments

- Created as a beginner-friendly introduction to Java programming
- Includes IntelliJ IDEA configuration for easy development
- Designed to demonstrate basic Java concepts clearly and simply