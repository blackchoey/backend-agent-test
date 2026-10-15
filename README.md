# Backend Agent Test

A small Java command-line program that searches an integer array for a target
value using binary search.

## Requirements

- Java Development Kit (JDK)

## Build

From the repository root, compile the program with:

```sh
javac src/Main.java
```

## Run

Provide the array elements in ascending order, followed by the target value:

```sh
java -cp src Main <array elements> <target value>
```

For example:

```sh
java -cp src Main 1 2 3 4 5 3
```

The program prints the target's index, or `-1` if it is not found:

```text
Result index: 2
```

The current binary search implementation can miss a target when the remaining
search interval contains only one element.
