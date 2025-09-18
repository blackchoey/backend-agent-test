# Backend Agent Test

A simple Java console application that demonstrates basic Java programming concepts including output formatting and loops.

## Description

This project contains a basic Java application that:
- Prints a welcome message to the console
- Demonstrates a simple for loop by counting from 1 to 5
- Serves as a foundation for testing backend development workflows

## Prerequisites

- **Java 21** or higher
- A Java IDE (IntelliJ IDEA recommended, project files included)

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .idea/                 # IntelliJ IDEA project configuration
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ module file
└── README.md             # This file
```

## Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Using IntelliJ IDEA (Recommended):**
   - Open IntelliJ IDEA
   - File → Open → Select the project directory
   - The IDE will automatically detect the project configuration

3. **Using Command Line:**
   - Ensure Java 21 is installed and accessible via `java` and `javac` commands
   - Navigate to the project directory

## Usage

### Running with IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the run button (green arrow) or press `Shift + F10`

### Running from Command Line

1. **Compile the project:**
   ```bash
   javac -d out src/Main.java
   ```

2. **Run the application:**
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

## Development

### Code Overview
- **Main.java**: Contains the main application logic
  - `main()` method serves as the entry point
  - Demonstrates `System.out.printf()` for formatted output
  - Uses a for loop to iterate and print numbers

### Adding New Features
1. Modify the `src/Main.java` file
2. Recompile and run to test changes
3. Follow Java naming conventions and best practices

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## License

This project is intended for educational and testing purposes.