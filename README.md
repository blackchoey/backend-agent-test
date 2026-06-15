# backend-agent-test

Simple Java CLI program that runs a binary search on a sorted integer array.

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

Expected output format:

```text
Result index: <index-or--1>
```
