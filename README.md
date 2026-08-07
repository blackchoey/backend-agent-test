# Backend Agent Test

A small Java command-line program that performs a binary search on integer input.

## Requirements

- Java Development Kit (JDK) 8 or later

## Run

Compile the program from the repository root:

```bash
javac src/Main.java
```

Provide the sorted array elements followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 3
```

The program prints the target's index, or `-1` when it is not found:

```text
Result index: 2
```
