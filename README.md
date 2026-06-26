# backend-agent-test

A simple Java project demonstrating a binary search implementation.

## Build

Compile the source file from the repository root:

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

This searches the array `[1, 2, 3, 4, 5]` for the value `5` and prints the result index.
