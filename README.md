# backend-agent-test

A small Java command-line app that performs a binary search on integer input.

## Requirements

- Java (JDK 8+)

## Build

From the repository root:

```bash
javac src/Main.java
```

## Run

Pass sorted array elements followed by the target value:

```bash
java -cp src Main <array elements> <target value>
```

Example:

```bash
java -cp src Main 1 2 3 4 5 5
```

If no valid input is provided, the app prints usage instructions.
