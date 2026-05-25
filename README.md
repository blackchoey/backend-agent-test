# backend-agent-test

Minimal Java CLI app that runs a binary search on sorted integer inputs.

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

The final argument is the target value; all preceding arguments are the sorted array elements.

Example:

```bash
java -cp src Main 1 2 3 4 5 3
```

Output:

```text
Result index: 2
```
