# Backend Agent Test

A simple Java "Hello World" application for testing backend agent functionality.

## Description

This project contains a basic Java application that demonstrates fundamental programming concepts including:
- Console output with formatted strings
- Loop structures
- Basic program flow

The application prints a welcome message and then displays numbers from 1 to 5.

## Prerequisites

- Java 17 or higher
- Java Development Kit (JDK) installed

## Getting Started

### Building the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Compile the Java source code:
   ```bash
   javac src/Main.java -d out
   ```

### Running the Application

After compilation, run the application:
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

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application file
├── out/                   # Compiled bytecode (generated)
├── .idea/                 # IntelliJ IDEA project files
├── .gitignore            # Git ignore patterns
├── test.iml              # IntelliJ module file
└── README.md             # This file
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

If you encounter any issues or have questions, please feel free to open an issue on the GitHub repository.