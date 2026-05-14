# backend-agent-test

A small Java CLI app that performs binary search on a sorted integer array.

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
java -cp src Main 1 2 3 4 5 5
```

The program prints:

```text
Result index: <index or -1>
```
