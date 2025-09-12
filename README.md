# Backend Agent Test

A simple Java application that demonstrates basic console output and iteration. This project serves as a test repository for backend development practices and agent-based testing.

## Description

This is a basic Java program that:
- Displays a welcome message
- Demonstrates a simple loop that counts from 1 to 5
- Includes IntelliJ IDEA integration with helpful tips and debugging support

## Prerequisites

- Java 17 or higher
- A Java compiler (included with JDK)
- Optional: IntelliJ IDEA for enhanced development experience

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .idea/                 # IntelliJ IDEA project files
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ module file
└── README.md             # This file
```

## How to Compile and Run

### Using Command Line

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Compile the Java source:**
   ```bash
   mkdir -p out
   javac src/Main.java -d out
   ```

3. **Run the application:**
   ```bash
   java -cp out Main
   ```

### Using IntelliJ IDEA

1. Open IntelliJ IDEA
2. Open the project by selecting the project directory
3. Navigate to `src/Main.java`
4. Click the green "Run" button in the gutter or press the run shortcut
5. Use the debug features as indicated by the helpful tips in the code

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

This project is set up for IntelliJ IDEA development with:
- Source folder configured in `src/`
- Output compilation to `out/` directory (excluded from git)
- Debug breakpoints and IntelliJ tips included in the source code

## Contributing

This is a test repository. Feel free to experiment with:
- Adding new features to the Main class
- Implementing additional Java classes
- Testing different development workflows

## License

This project is for educational and testing purposes.