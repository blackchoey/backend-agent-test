package com.example;

/**
 * Utility class demonstrating basic mathematical operations
 * and object-oriented programming concepts.
 */
public class MathUtils {
    
    /**
     * Adds two integers and returns the result.
     * 
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts second integer from the first and returns the result.
     * 
     * @param a first integer (minuend)
     * @param b second integer (subtrahend)
     * @return difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two integers and returns the result.
     * 
     * @param a first integer
     * @param b second integer
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divides first integer by the second and returns the result.
     * 
     * @param a dividend
     * @param b divisor
     * @return quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
    
    /**
     * Calculates the factorial of a non-negative integer.
     * 
     * @param n non-negative integer
     * @return factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}