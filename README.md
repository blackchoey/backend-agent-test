# Java Hello World Project

A simple Java application that demonstrates basic console output and loop functionality. This project serves as an introductory example for learning Java programming fundamentals.

## Features

- **Console Output**: Displays a welcome message to the user
- **Iterative Processing**: Demonstrates a for-loop that counts from 1 to 5
- **Basic Java Structure**: Shows fundamental Java application structure with a main method
- **IntelliJ IDEA Integration**: Pre-configured for development in IntelliJ IDEA

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
  - Tested with OpenJDK 17.0.16
  - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- **IDE (Optional)**: IntelliJ IDEA (project files included) or any Java-compatible IDE
- **Command Line Tools**: Basic familiarity with terminal/command prompt

## Installation and Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Verify Java installation**:
   ```bash
   java --version
   javac --version
   ```

3. **Open in IntelliJ IDEA** (optional):
   - Open IntelliJ IDEA
   - Select "Open" and choose the project directory
   - The project will be automatically configured using the included `.iml` file

## How to Compile and Run

### Using Command Line

1. **Compile the program**:
   ```bash
   javac src/Main.java -d out
   ```

2. **Run the program**:
   ```bash
   java -cp out Main
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Right-click on `Main.java` in the project explorer
3. Select "Run 'Main.main()'" or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (Mac)

## Project Structure

```
backend-agent-test/
├── .idea/                 # IntelliJ IDEA configuration files
├── src/                   # Source code directory
│   └── Main.java         # Main application class
├── out/                   # Compiled bytecode output (created after compilation)
├── .gitignore            # Git ignore rules for Java projects
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

### File Descriptions

- **`src/Main.java`**: Contains the main application logic with console output and loop demonstration
- **`test.iml`**: IntelliJ IDEA module configuration file that defines the project structure
- **`.gitignore`**: Excludes IDE-specific files and build artifacts from version control

## Example Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

The program first prints a welcome message, then displays the numbers 1 through 5, each on a separate line.

## Code Overview

The `Main.java` file contains:

- A `main` method that serves as the entry point for the application
- A `System.out.printf()` call that displays the welcome message
- A for-loop that iterates from 1 to 5, printing each iteration value
- IntelliJ IDEA tips and shortcuts as comments (marked with `//TIP`)

## Contributing

We welcome contributions to improve this project! Here's how you can help:

### Getting Started

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-feature-name`
3. Make your changes
4. Test your changes by compiling and running the program
5. Commit your changes: `git commit -am 'Add some feature'`
6. Push to the branch: `git push origin feature/your-feature-name`
7. Submit a pull request

### Guidelines

- Follow Java naming conventions
- Add comments for complex logic
- Ensure code compiles without warnings
- Test your changes before submitting
- Keep changes focused and atomic

### Ideas for Enhancements

- Add user input functionality
- Implement additional mathematical operations
- Create more complex loop examples
- Add error handling
- Include unit tests

## License

This project is licensed under the MIT License - see below for details:

```
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## Support

If you encounter any issues or have questions:

1. Check the [Issues](https://github.com/blackchoey/backend-agent-test/issues) page for existing solutions
2. Create a new issue if your problem isn't already documented
3. Provide detailed information about your environment and the steps to reproduce any issues

---

*This project was created as a learning example for Java programming fundamentals.*