# Binary Search – Java Demo

A simple Java project demonstrating a binary search implementation.

## Project Structure

```
src/
└── Main.java   # Binary search implementation and entry point
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Build & Run

### Compile

```bash
javac src/Main.java -d out
```

### Run

```bash
java -cp out Main <sorted array elements> <target value>
```

The last argument is the **target value** to search for. All preceding arguments are the elements of the **sorted integer array**.

### Example

```bash
java -cp out Main 1 2 3 4 5 5
```

Expected output:
```
Result index: 4
```

## Usage

```
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```

- If the target value is found, the program prints its zero-based index in the array.
- If the target value is not found, the program prints `-1`.

## Known Issues

The `while` loop condition in `binarySearch` uses `i < j` instead of `i <= j`, which causes the search to miss an element when the search space is narrowed to a single element. This means the last remaining candidate is never checked, and the method incorrectly returns `-1` in that case.
