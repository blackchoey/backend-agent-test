# Backend Agent Test

A simple Java application demonstrating basic programming concepts with a "Hello World" program that includes a loop counter.

## Project Overview

This is a basic Java project that outputs a welcome message and demonstrates loop functionality by printing numbers from 1 to 5. The project serves as a simple backend test implementation.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .gitignore            # Git ignore file
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line tools

## Installation & Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Ensure you have Java installed:
   ```bash
   java -version
   javac -version
   ```

## Usage

### Compile and Run

1. **Compile the Java code:**
   ```bash
   javac src/Main.java
   ```

2. **Run the application:**
   ```bash
   java -cp src Main
   ```

### Expected Output

```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. The `test.iml` file contains the module configuration
3. Run the `Main` class directly from the IDE

### Code Structure

- **Main.java**: Contains the main method with:
  - Welcome message output
  - Loop demonstration (1-5 counter)
  - Built-in debugging support comments

## Features

- Simple console output
- Loop iteration demonstration
- IDE-ready with IntelliJ IDEA configuration
- Clean project structure

## Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature-name`
3. Make your changes and commit: `git commit -m 'Add feature'`
4. Push to the branch: `git push origin feature-name`
5. Submit a pull request

## License

This project is open source and available under standard terms.

## Notes

This project includes IntelliJ IDEA tips and debugging setup comments within the source code to help with development workflow.