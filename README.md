# backend-agent-test

A simple Java project demonstrating a binary search implementation.

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

Run the program by providing a sorted array of integers followed by the target value to search for:

```bash
java -cp src Main <array elements> <target value>
```

### Example

```bash
java -cp src Main 1 2 3 4 5 5
```

The program prints the zero-based index of the target in the array, or `-1` if the target is not found.

```
Result index: 4
```
