package com.calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        int result = calculator.sum(10, 5);
        Assertions.assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(10, 5);
        Assertions.assertEquals(50, result);
    }

    @Test
    void testDivision() {
        double result = calculator.division(10, 5);
        Assertions.assertEquals(2.0, result);
    }

    @Test
    void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.division(10, 0);
        });
    }
}
