# Backend Agent Test

A simple Java application that demonstrates basic console output and loop functionality.

## Description

This is a basic Java program that prints a welcome message and displays numbers from 1 to 5. The project serves as a simple example of Java console application development.

## Requirements

- Java 17 or higher
- Any Java IDE (IntelliJ IDEA recommended, as the project includes IntelliJ configuration files)

## Project Structure

```
.
├── src/
│   └── Main.java          # Main application class
├── .idea/                 # IntelliJ IDEA configuration files
├── .gitignore            # Git ignore rules
├── test.iml              # IntelliJ module file
└── README.md             # This file
```

## How to Compile and Run

### Command Line

1. **Compile the project:**
   ```bash
   javac src/Main.java -d out/
   ```

2. **Run the application:**
   ```bash
   java -cp out Main
   ```

### IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Right-click on `Main.java` in the `src` folder
3. Select "Run 'Main.main()'" or press `Ctrl+Shift+F10`

## Expected Output

When you run the application, you should see the following output:

```
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5
```

## Development

This project is set up as an IntelliJ IDEA project. The `.idea` folder contains IDE-specific configuration files, and `test.iml` is the module file for the project.

### Getting Started

1. Clone the repository
2. Open the project in your preferred Java IDE
3. Compile and run the `Main` class

## Contributing

This is a simple test project. Feel free to fork and experiment with the code.