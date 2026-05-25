# backend-agent-test

Simple Java CLI app that runs a binary search on sorted integer input.

## Requirements

- Java (JDK 8+)

## Build

From the repository root:

```bash
javac src/Main.java
```

## Run

Pass sorted array values followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 3
```

Example output:

```text
Result index: 2
```

If no arguments are provided, usage help is printed.
