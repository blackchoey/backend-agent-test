# Backend Agent Test

A simple Java application demonstrating basic Java programming concepts. This project serves as a test repository for backend development practices and agent-based testing scenarios.

## Description

This project contains a basic Java "Hello World" application that:
- Prints a welcome message to the console
- Demonstrates a simple for loop by printing numbers 1 through 5
- Serves as a foundation for testing backend agent interactions

## Prerequisites

Before running this project, ensure you have the following installed:

- **Java Development Kit (JDK) 17 or higher**
- A Java-compatible IDE (IntelliJ IDEA recommended, as project files are included)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. Verify Java installation:
   ```bash
   java --version
   ```

## Usage

### Compiling and Running from Command Line

1. Compile the Java source file:
   ```bash
   javac src/Main.java
   ```

2. Run the compiled program:
   ```bash
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

### Running in IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Right-click on the file and select "Run 'Main.main()'"
   - Or use the keyboard shortcut as indicated in the code comments
   - Or click the run icon in the gutter

## Project Structure

```
backend-agent-test/
├── .idea/                 # IntelliJ IDEA project configuration
│   ├── misc.xml
│   ├── modules.xml
│   └── vcs.xml
├── src/                   # Source code directory
│   └── Main.java         # Main application class
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Development

### Code Structure

- **Main.java**: Contains the main class with a simple program that demonstrates:
  - Basic console output using `System.out.printf()` and `System.out.println()`
  - A for loop iteration from 1 to 5
  - IntelliJ IDEA tip comments for IDE features

### Adding New Features

1. Create new Java files in the `src/` directory
2. Follow Java naming conventions (PascalCase for classes)
3. Ensure all code compiles without errors
4. Test your changes by running the application

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Make your changes
4. Commit your changes (`git commit -am 'Add some feature'`)
5. Push to the branch (`git push origin feature/new-feature`)
6. Create a new Pull Request

## Notes

- This project uses IntelliJ IDEA project files for easy setup
- The `.gitignore` file is configured to exclude common build artifacts and IDE-specific files
- The code includes helpful tips for IntelliJ IDEA users
- This repository is designed for testing backend agent interactions and development workflows

## License

This project is for educational and testing purposes. Please refer to the repository owner for specific licensing information.