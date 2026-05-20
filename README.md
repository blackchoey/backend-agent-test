# backend-agent-test

A simple Java project demonstrating a binary search implementation.

## Build

Compile the source from the repository root:

```bash
javac src/Main.java
```

## Usage

Run the program by passing a sorted array of integers followed by the target value as command-line arguments:

```bash
java -cp src Main <array elements> <target value>
```

**Example** — search for `3` in the array `[1, 2, 3, 4, 5]`:

```bash
java -cp src Main 1 2 3 4 5 3
```

The program prints the zero-based index of the target in the array, or `-1` if the target is not found.

## Project Structure

```
src/
  Main.java   # Binary search implementation and entry point
```
