# backend-agent-test

Small Java CLI app that runs binary search on a sorted integer array.

## Requirements

- Java (JDK 8+)

## Build

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

This command searches for target `5` (last argument) in the sorted array `[1, 2, 3, 4, 5]`.
