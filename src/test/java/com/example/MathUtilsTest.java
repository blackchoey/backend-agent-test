package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for MathUtils class demonstrating
 * testing best practices with JUnit 5.
 */
@DisplayName("MathUtils Tests")
class MathUtilsTest {
    
    private MathUtils mathUtils;
    
    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }
    
    @Test
    @DisplayName("Addition should return correct sum")
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(0, mathUtils.add(-5, 5));
        assertEquals(-10, mathUtils.add(-5, -5));
    }
    
    @Test
    @DisplayName("Subtraction should return correct difference")
    void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertEquals(-8, mathUtils.subtract(2, 10));
        assertEquals(0, mathUtils.subtract(5, 5));
    }
    
    @Test
    @DisplayName("Multiplication should return correct product")
    void testMultiply() {
        assertEquals(15, mathUtils.multiply(3, 5));
        assertEquals(0, mathUtils.multiply(0, 10));
        assertEquals(-20, mathUtils.multiply(-4, 5));
    }
    
    @Test
    @DisplayName("Division should return correct quotient")
    void testDivide() {
        assertEquals(2.5, mathUtils.divide(5, 2), 0.001);
        assertEquals(-2.0, mathUtils.divide(-10, 5), 0.001);
        assertEquals(0.0, mathUtils.divide(0, 5), 0.001);
    }
    
    @Test
    @DisplayName("Division by zero should throw ArithmeticException")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }
    
    @Test
    @DisplayName("Factorial should return correct values")
    void testFactorial() {
        assertEquals(1, mathUtils.factorial(0));
        assertEquals(1, mathUtils.factorial(1));
        assertEquals(6, mathUtils.factorial(3));
        assertEquals(120, mathUtils.factorial(5));
    }
    
    @Test
    @DisplayName("Factorial with negative number should throw IllegalArgumentException")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }
}