# Binary Search Demo

A simple Java project demonstrating a binary search implementation with a command-line interface.

## Project Structure

```
src/
  Main.java   # Binary search implementation and CLI entry point
```

## Build

Compile the project from the repository root:

```bash
javac src/Main.java
```

## Usage

Run the program by passing a sorted array followed by the target value:

```bash
java -cp src Main <array elements> <target value>
```

### Example

```bash
java -cp src Main 1 2 3 4 5 5
```

The program prints the index of the target in the array, or `-1` if not found.
