# backend-agent-test

A simple Java project demonstrating a binary search implementation.

## Project Structure

```
src/
  Main.java   # Binary search implementation with a command-line interface
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

This searches for the value `5` in the array `[1, 2, 3, 4, 5]` and prints the index where it is found, or `-1` if not found.

## Output

```
Result index: 4
```
