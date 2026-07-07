# backend-agent-test

Simple Java CLI application that runs a binary search against integer input from command-line arguments.

## Prerequisites

- Java (JDK 8+)

## Build

From the repository root:

```bash
javac src/Main.java
```

## Run

Pass sorted array elements followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 7
```

The program prints the found index, or `-1` if the value is not found.
