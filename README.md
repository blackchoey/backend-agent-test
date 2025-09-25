# Backend Agent Test

A simple Java application demonstrating basic console output and loop functionality.

## Description

This project contains a basic Java application that prints a welcome message and demonstrates a simple for loop by printing numbers from 1 to 5. It serves as a foundational example for Java programming concepts and can be used as a starting point for more complex backend applications.

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .idea/                 # IntelliJ IDEA project files
├── .gitignore            # Git ignore file
├── test.iml              # IntelliJ IDEA module file
└── README.md             # This file
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA recommended) or command line tools

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. No additional dependencies are required for this simple project.

## Usage

### Command Line

1. Compile the Java source code:
   ```bash
   javac -d out src/Main.java
   ```

2. Run the compiled program:
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

### IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green run button or press the run shortcut
4. View the output in the console

## Development

### Code Structure

- **Main.java**: Contains the main entry point of the application
  - Prints a welcome message
  - Demonstrates a for loop that iterates from 1 to 5
  - Includes IntelliJ IDEA tips as comments

### Modifying the Code

The application currently:
- Prints "Hello and welcome!" message
- Loops through numbers 1-5 and prints each iteration

You can modify these behaviors by editing the `Main.java` file:
- Change the welcome message in the `System.out.printf()` statement
- Modify the loop range by changing the condition `i <= 5`
- Add additional functionality within the main method

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Make your changes
4. Commit your changes (`git commit -am 'Add some feature'`)
5. Push to the branch (`git push origin feature/your-feature`)
6. Create a Pull Request

## License

This project is open source and available under standard terms.

## Author

Created by blackchoey