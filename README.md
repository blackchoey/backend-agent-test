# backend-agent-test

Simple Java CLI app that runs a binary search against command-line input values.

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

In this example, the first five numbers (`1 2 3 4 5`) are the array and the last `5` is the target value to search for.
