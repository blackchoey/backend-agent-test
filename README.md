# backend-agent-test

Simple Java console app that runs a binary search on command-line inputs.

## Requirements

- Java (JDK 8+)

## Compile

```bash
javac src/Main.java
```

## Run

```bash
java -cp src Main <array elements...> <target value>
```

Example:

```bash
java -cp src Main 1 2 3 4 5 3
```

In the example above, the final argument (`3`) is the target value to search for.
