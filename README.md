# Backend Agent Test

A simple Java application demonstrating basic programming concepts and serving as a foundation for backend development learning and testing.

## Description

This project contains a basic Java program that demonstrates:
- Simple console output
- Loop iterations
- Basic Java syntax and structure

The main application prints a welcome message and displays numbers from 1 to 5, making it an ideal starting point for Java development and testing.

## Prerequisites

- **Java Development Kit (JDK) 17 or higher**
  - You can download it from [OpenJDK](https://openjdk.org/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
  - Verify installation with: `java -version`

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Verify Java installation:**
   ```bash
   java -version
   javac -version
   ```

## Usage

### Compiling the Program

```bash
javac src/Main.java
```

### Running the Program

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

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .gitignore            # Git ignore patterns
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Development

### Using IntelliJ IDEA

This project is configured for IntelliJ IDEA:

1. Open IntelliJ IDEA
2. Select "Open" and choose the project directory
3. The project should be automatically configured
4. Run the program by right-clicking `Main.java` and selecting "Run 'Main.main()'"

### Using Command Line

For development using command line tools:

1. **Edit the source code** in `src/Main.java`
2. **Compile** with `javac src/Main.java`
3. **Run** with `java -cp src Main`
4. **Clean** compiled files with `rm src/*.class` (if needed)

## Contributing

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Make** your changes
4. **Test** your changes by compiling and running the program
5. **Commit** your changes (`git commit -m 'Add some amazing feature'`)
6. **Push** to the branch (`git push origin feature/amazing-feature`)
7. **Open** a Pull Request

### Code Style

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Add comments for complex logic
- Keep methods small and focused

## Testing

To verify the program works correctly:

```bash
# Compile the program
javac src/Main.java

# Run the program
java -cp src Main

# Verify output matches expected result
```

## Troubleshooting

### Common Issues

**"javac: command not found"**
- Ensure JDK is installed and `JAVA_HOME` is set correctly
- Add Java bin directory to your `PATH`

**"Could not find or load main class Main"**
- Ensure you're running from the project root directory
- Use the correct classpath: `java -cp src Main`

**Permission denied errors**
- Check file permissions: `chmod +x src/Main.java`
- Ensure you have write permissions in the project directory

## License

This project is open source and available under the [MIT License](LICENSE).

## Contact

- **Repository**: [backend-agent-test](https://github.com/blackchoey/backend-agent-test)
- **Issues**: [GitHub Issues](https://github.com/blackchoey/backend-agent-test/issues)

---

*This README was created to provide comprehensive documentation for the backend-agent-test project.*