# Backend Agent Test

A small Java command-line example that searches a sorted integer array with
binary search.

## Requirements

- Java Development Kit (JDK)

## Compile

From the repository root:

```bash
javac src/Main.java
```

## Run

Pass the array elements followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 3
```

The program prints the target's index, or `-1` when it is not found:

```text
Result index: 2
```

The array must be sorted in ascending order for binary search to work as
intended.
