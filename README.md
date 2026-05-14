# backend-agent-test

Simple Java CLI app that performs a binary search on integer input passed via command-line arguments.

## Requirements

- Java (JDK 8+)

## Build

From the repository root:

```bash
javac src/Main.java
```

## Run

From the repository root:

```bash
java -cp src Main <array elements> <target value>
```

Example:

```bash
java -cp src Main 1 2 3 4 5 5
```

If insufficient arguments are provided, the program prints usage instructions.
