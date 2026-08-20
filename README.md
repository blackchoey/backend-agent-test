# Backend Agent Test

A small Java command-line application that searches a sorted array for a target value.

## Requirements

- Java Development Kit (JDK)

## Build

From the repository root, compile the application:

```sh
javac src/Main.java
```

## Run

Pass the sorted array elements followed by the target value:

```sh
java -cp src Main 1 2 3 4 5 3
```

The application prints the matching array index, or `-1` when the target is not found.
