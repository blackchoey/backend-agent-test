# Backend Agent Test

A simple Java console application that demonstrates basic output and looping functionality.

## Description

This project contains a simple Java program that:
- Prints a welcome message to the console
- Displays a counting loop from 1 to 5

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- **Operating System**: Windows, macOS, or Linux

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main application class
├── .gitignore            # Git ignore rules
├── .idea/                # IntelliJ IDEA configuration
├── test.iml              # IntelliJ module file
└── README.md             # Project documentation
```

## How to Compile and Run

### Using Command Line

1. **Clone the repository** (if not already done):
   ```bash
   git clone https://github.com/blackchoey/backend-agent-test.git
   cd backend-agent-test
   ```

2. **Compile the Java source code**:
   ```bash
   javac src/Main.java -d out
   ```

3. **Run the program**:
   ```bash
   java -cp out Main
   ```

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to `src/Main.java`
3. Click the green play button next to the `main` method or press `Ctrl+Shift+F10` (Windows/Linux) or `Cmd+Shift+R` (macOS)

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

This project was created using IntelliJ IDEA and includes:
- Basic Java syntax demonstration
- Console output using `System.out.printf()` and `System.out.println()`
- A simple for loop example

## Contributing

Feel free to fork this repository and submit pull requests for any improvements or bug fixes.

## License

This project is open source and available under standard terms.