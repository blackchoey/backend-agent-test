# Backend Agent Test

A simple Java application that demonstrates basic Java programming concepts with a "Hello World" style program.

## Description

This is a basic Java project that prints a welcome message and demonstrates a simple loop structure. It serves as a starting point for backend development testing and learning Java fundamentals.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.) or command line tools

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

## How to Run

### Using Command Line

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Compile the Java code:**
   ```bash
   mkdir -p out
   javac src/Main.java -d out
   ```

3. **Run the application:**
   ```bash
   java -cp out Main
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Right-click on the file and select "Run 'Main.main()'"
4. Or use the run button in the gutter next to the main method

## Expected Output

When you run the application, you should see:

```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## Features

- **Simple Hello World**: Demonstrates basic Java output
- **Loop Example**: Shows a simple for loop iterating from 1 to 5
- **IntelliJ Integration**: Includes IDE configuration for easy development

## Development

This project uses:
- Java 17+ (compatible with higher versions)
- Standard Java libraries (no external dependencies)
- IntelliJ IDEA project configuration

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is open source and available under standard terms for educational and testing purposes.