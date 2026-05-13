# backend-agent-test

Simple Java CLI app with a binary search example in `src/Main.java`.

## Prerequisites

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
java -cp src Main 1 2 3 4 5 4
```

In this example, the array elements are `1 2 3 4 5` and the target value (last argument) is `4`.

The program prints:

```text
Result index: <index or -1 if not found>
```
