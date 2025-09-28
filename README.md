# Backend Agent Test

A simple Java application for testing and learning purposes.

## Description

This is a basic Java console application that demonstrates fundamental programming concepts including:
- Basic console output
- For loops and iteration
- Simple program structure

The application prints a welcome message and displays numbers from 1 to 5.

## Prerequisites

- Java 17 or higher
- Any text editor or IDE (IntelliJ IDEA project files included)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. No additional dependencies are required as this is a standalone Java application.

## Usage

### Compile and Run

To compile and run the application:

```bash
# Compile the Java source code
javac src/Main.java

# Run the application
java -cp src Main
```

### Expected Output

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
├── src/
│   └── Main.java          # Main application class
├── .idea/                 # IntelliJ IDEA project configuration
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Development

### Using IntelliJ IDEA

This project includes IntelliJ IDEA configuration files. To open in IntelliJ IDEA:

1. Open IntelliJ IDEA
2. Choose "Open" and select the project directory
3. The project should be automatically configured

### Manual Compilation

For manual compilation without an IDE:

```bash
# Navigate to project directory
cd backend-agent-test

# Compile
javac src/Main.java

# Run
java -cp src Main

# Clean compiled files
rm src/*.class
```

## Contributing

This is a simple test project. Feel free to fork and experiment with the code.

## License

This project is for educational and testing purposes.