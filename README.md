# Backend Agent Test

A Java implementation of a binary search algorithm for educational purposes.

## Description

This project contains a simple Java program that demonstrates binary search implementation. The program accepts an array of integers and a target value as command-line arguments, then performs a binary search to find the target value's index in the array.

## Features

- Binary search implementation
- Command-line interface
- Input validation
- Clear usage instructions

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java compiler (`javac`)

## Installation

Clone the repository:
```bash
git clone https://github.com/blackchoey/backend-agent-test.git
cd backend-agent-test
```

## Compilation

Compile the Java source code:
```bash
javac src/Main.java -d out
```

## Usage

Run the program with the following syntax:
```bash
java -cp out Main <array elements> <target value>
```

### Arguments
- `<array elements>`: Space-separated integers representing the array to search (all elements except the last)
- `<target value>`: The integer value to search for (last argument)

### Example

```bash
java -cp out Main 1 2 3 4 5 5
```

This command will:
- Create an array: `[1, 2, 3, 4, 5]`
- Search for the target value: `5`
- Output: `Result index: <index>` (or `-1` if not found)

## Project Structure

```
backend-agent-test/
├── src/
│   └── Main.java          # Main program with binary search implementation
├── .gitignore             # Git ignore rules
├── test.iml               # IntelliJ IDEA module file
└── README.md              # This file
```

## Known Issues

⚠️ **Note**: The current binary search implementation contains a known bug in the loop condition (line 7). The condition uses `i < j` instead of `i <= j`, which may cause the search to miss certain target values when they are at the point where `i == j`.

## License

This is a test/educational project.

## Contributing

This is a test repository for backend agent functionality.
