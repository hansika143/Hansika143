package main;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        testAdd(calculator);
        testSubtract(calculator);
        testMultiply(calculator);
        testDivide(calculator);
        testDivideByZero(calculator);

        System.out.println("Test passed");
    }

    private static void testAdd(Calculator calculator) {
        if (calculator.add(2, 3) != 5) {
            throw new RuntimeException("Add test failed");
        }
    }

    private static void testSubtract(Calculator calculator) {
        if (calculator.subtract(5, 3) != 2) {
            throw new RuntimeException("Subtract test failed");
        }
    }

    private static void testMultiply(Calculator calculator) {
        if (calculator.multiply(4, 3) != 12) {
            throw new RuntimeException("Multiply test failed");
        }
    }

    private static void testDivide(Calculator calculator) {
        if (calculator.divide(10, 2) != 5) {
            throw new RuntimeException("Divide test failed");
        }
    }

    private static void testDivideByZero(Calculator calculator) {
        try {
            calculator.divide(10, 0);
            throw new RuntimeException("Divide by zero test failed");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
}