# Backend Agent Test

A simple Java application for testing backend agent functionality.

## Description

This project contains a basic Java application with a Main class that demonstrates:
- Console output
- Loop iteration
- Basic Java programming concepts

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Git (for version control)

### Running the Application

#### Option 1: Using Java directly
```bash
# Compile the Java source code
javac -d out src/Main.java

# Run the compiled application
java -cp out Main
```

#### Option 2: Using Gradle (if build.gradle is present)
```bash
# Run the application
./gradlew run
```

### Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── test/                  # Test directory (if present)
├── out/                   # Compiled output directory
├── .gitignore            # Git ignore patterns
└── README.md             # This file
```

## Output

When you run the application, you should see:
```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test your changes
5. Submit a pull request

## License

This project is open source and available under the [MIT License](LICENSE).