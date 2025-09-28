# Backend Agent Test

A simple Java console application that demonstrates basic programming concepts with a welcome message and loop functionality.

## Description

This project contains a basic Java application that:
- Displays a welcome message to the user
- Demonstrates a simple for loop by counting from 1 to 5
- Serves as a foundation for backend development testing and learning

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA recommended) or command line tools

## Installation

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

### Running with Command Line

1. Compile the Java source code:
   ```bash
   javac src/Main.java -d out
   ```

2. Run the application:
   ```bash
   java -cp out Main
   ```

### Expected Output
```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

### Running with IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green arrow next to the `main` method or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (Mac)

## Project Structure

```
backend-agent-test/
├── .idea/                 # IntelliJ IDEA configuration files
├── src/
│   └── Main.java         # Main application class
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── README.md             # Project documentation
```

## Features

- Simple console output demonstration
- Basic loop implementation
- Clean, commented code structure
- IntelliJ IDEA project setup

## Development

This project uses standard Java development practices:
- Source code is located in the `src/` directory
- The main entry point is the `Main` class
- Compilation output goes to the `out/` directory (gitignored)

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is available for educational and testing purposes. Please check with the repository owner for specific licensing terms.

## Contact

Project Link: [https://github.com/blackchoey/backend-agent-test](https://github.com/blackchoey/backend-agent-test)