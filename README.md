# backend-agent-test 🔎

Small Java command-line application for running a binary search on a sorted list of integers.

## Requirements ✅

- Java (JDK 8+)

## Build 🛠️

From the repository root:

```bash
javac src/Main.java
```

## Run ▶️

Pass the sorted array values first, followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 5
```

If too few arguments are provided, the program prints usage help:

```text
Usage: java Main <array elements> <target value>
Example: java Main 1 2 3 4 5 5
```
