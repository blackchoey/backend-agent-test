# Backend Agent Test

A simple Java console application that demonstrates basic Java programming concepts.

## Description

This project contains a simple Java program that:
- Prints a welcome message to the console
- Demonstrates a basic for loop by counting from 1 to 5
- Serves as a starting point for Java development

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application entry point
├── .idea/                 # IntelliJ IDEA project settings
├── .gitignore            # Git ignore patterns
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA recommended) or a text editor

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test
```

### Compile and Run

#### Using Command Line

1. Compile the Java source file:
```bash
javac src/Main.java
```

2. Run the compiled program:
```bash
java -cp src Main
```

#### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green run button or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (Mac)

## Expected Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

This project is set up as an IntelliJ IDEA project with the following configuration:
- Source files are located in the `src/` directory
- The project uses the default JDK configured in your IDE
- No external dependencies are required

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Create a new Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).