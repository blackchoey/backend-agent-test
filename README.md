# backend-agent-test

A simple Java project that demonstrates a binary search implementation.

## Prerequisites

- Java Development Kit (JDK) 8 or later

## Build

Compile the source from the repository root:

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

The program prints the index of the target value in the array, or `-1` if not found.

## Project Structure

```
src/
  Main.java   # Binary search implementation and entry point
```
