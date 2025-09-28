# Backend Agent Test

A simple Java application that demonstrates basic console output and loop iteration. This project serves as a basic example or testing ground for Java development.

## Description

This application prints a welcome message and then displays numbers from 1 to 5 in a loop. It's a classic "Hello World" style program that can be used for:
- Testing Java development environment setup
- Demonstrating basic Java syntax
- Serving as a starting point for more complex applications

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command line access or Java IDE (IntelliJ IDEA project files included)

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .idea/                 # IntelliJ IDEA configuration files
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## How to Build and Run

### Using Command Line

1. **Compile the program:**
   ```bash
   javac src/Main.java
   ```

2. **Run the program:**
   ```bash
   java -cp src Main
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green arrow next to the `main` method or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (Mac)

## Expected Output

When you run the program, you should see:
```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

This project is configured for IntelliJ IDEA development with the following features:
- Source folder: `src/`
- Output excluded via `.gitignore`
- Standard Java module configuration

## Contributing

This is a simple test project. Feel free to:
- Add more functionality to the Main class
- Create additional classes
- Implement unit tests
- Enhance the output formatting

## License

This project is provided as-is for educational and testing purposes.