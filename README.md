# Backend Agent Test

A simple Java console application that demonstrates basic Java programming concepts including loops and console output.

## Description

This project contains a basic Java program that:
- Prints a welcome message to the console
- Demonstrates a simple for loop by counting from 1 to 5
- Serves as a foundation for learning Java development

## Prerequisites

- **Java 17** or higher
- Any Java IDE (IntelliJ IDEA recommended, project files included)
- Or a terminal/command prompt for compilation and execution

## Getting Started

### Option 1: Using IntelliJ IDEA

1. Clone this repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Open the project in IntelliJ IDEA by opening the `.iml` file or the project directory

3. Run the `Main` class by clicking the run button or pressing `Shift + F10`

### Option 2: Using Command Line

1. Clone this repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Compile the Java source code:
   ```bash
   javac src/Main.java -d .
   ```

3. Run the compiled program:
   ```bash
   java Main
   ```

## Expected Output

When you run the program, you should see:
```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Project Structure

```
backend-agent-test/
├── .idea/              # IntelliJ IDEA project configuration
├── src/
│   └── Main.java       # Main application class
├── .gitignore          # Git ignore configuration
├── test.iml            # IntelliJ IDEA module file
└── README.md           # This file
```

## Development

### Code Structure

- **Main.java**: Contains the main application logic with a simple loop demonstration
- The application uses standard Java console output methods (`System.out.printf` and `System.out.println`)

### Making Changes

1. Edit the `src/Main.java` file to modify the application behavior
2. Compile and test your changes using the steps above
3. Follow Java coding conventions and best practices

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Make your changes
4. Test your changes thoroughly
5. Commit your changes (`git commit -am 'Add some feature'`)
6. Push to the branch (`git push origin feature/your-feature`)
7. Create a Pull Request

## Java Version

This project is configured to use Java 17. Make sure you have Java 17 or a compatible version installed on your system.

To check your Java version:
```bash
java --version
javac --version
```

## License

This project is available for educational and testing purposes.