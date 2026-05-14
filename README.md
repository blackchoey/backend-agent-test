# backend-agent-test

Simple Java command-line program that runs a binary search.

## Prerequisites

- Java Development Kit (JDK) installed

## Build

From the repository root:

```bash
javac src/Main.java
```

## Run

Pass sorted array elements followed by the target value:

```bash
java -cp src Main <array elements> <target value>
```

Example:

```bash
java -cp src Main 1 2 3 4 5 5
```

In this example, the first five numbers (`1 2 3 4 5`) are the array and the final `5` is the target value to search for.
