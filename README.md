# Backend Agent Test

A simple Java project containing a binary search implementation for testing purposes.

## Project Structure

```
.
├── src/
│   └── Main.java        # Main application with binary search algorithm
├── test.iml             # IntelliJ IDEA module file
└── README.md            # This file
```

## Usage

### Compile the program

```bash
javac src/Main.java -d out
```

### Run the program

```bash
java -cp out Main <array elements> <target value>
```

### Example

```bash
java -cp out Main 1 2 3 4 5 3
```

This will search for the value `3` in the array `[1, 2, 3, 4, 5]` and output the result index.

## Features

- Binary search algorithm implementation
- Command-line interface for searching values in a sorted array
