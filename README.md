# backend-agent-test

Small Java command-line app with a binary search example.

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

In this example, `1 2 3 4 5` are the sorted array elements and the final `5` is the target value.
