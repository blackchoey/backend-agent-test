# backend-agent-test

Small Java command-line example for running a binary search against integer input.

## Requirements

- Java Development Kit (JDK)

## Build

From `/home/runner/work/backend-agent-test/backend-agent-test`:

```bash
javac src/Main.java
```

## Run

Pass sorted array elements followed by the target value:

```bash
java -cp src Main 1 2 3 4 5 5
```

If no arguments are provided, the program prints usage instructions.
