# backend-agent-test

Simple Java CLI app that runs a binary search over command-line input.

## Requirements

- Java (JDK 8+)

## Build

From the repository root:

```bash
javac src/Main.java
```

## Run

```bash
java -cp src Main <array elements> <target value>
```

Example:

```bash
java -cp src Main 1 2 3 4 5 5
```

Expected output format:

```text
Result index: <number>
```
