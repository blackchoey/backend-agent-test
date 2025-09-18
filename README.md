# Backend Agent Test

A simple Java application that demonstrates basic console output and loop functionality.

## Description

This is a basic Java program that prints a welcome message followed by a numbered list from 1 to 5. It serves as a simple example of Java syntax and basic programming concepts.

## Features

- Console output with formatted text
- Loop iteration and display
- Basic Java application structure

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA recommended) or command line tools

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application file
├── .idea/                 # IntelliJ IDEA configuration files
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Getting Started

### Using Command Line

1. **Clone the repository:**
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Compile the Java program:**
   ```bash
   javac src/Main.java
   ```

3. **Run the program:**
   ```bash
   java -cp src Main
   ```

### Using IntelliJ IDEA

1. **Open the project:**
   - Launch IntelliJ IDEA
   - Open the project folder
   - The IDE will automatically recognize the project structure

2. **Run the program:**
   - Right-click on `Main.java` in the project explorer
   - Select "Run 'Main.main()'"
   - Or use the run button in the toolbar

## Expected Output

When you run the program, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Code Overview

The `Main.java` file contains:
- A `main` method that serves as the entry point
- A welcome message using `System.out.printf()`
- A for loop that prints numbers from 1 to 5 using `System.out.println()`

## Development

This project is set up for development with IntelliJ IDEA and includes:
- Standard Java project structure
- IntelliJ IDEA configuration files
- Appropriate `.gitignore` settings for Java projects

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test your changes
5. Submit a pull request

## License

This project is available for educational and demonstration purposes.