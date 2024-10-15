import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    @Test
    public void testSubtractionWithPositiveNumbers() {
        int minuend = 10;
        int subtrahend = 5;
        int expectedResult = 5;
        int actualResult = MathOperations.subtraction(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, "Subtraction with positive numbers should work correctly.");
    }

    @Test
    public void testSubtractionWithNegativeNumbers() {
        int minuend = -5;
        int subtrahend = 3;
        int expectedResult = -8;
        int actualResult = MathOperations.subtraction(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, "Subtraction with negative numbers should work correctly.");
    }

    @Test
    public void testMultiplicationWithPositiveNumbers() {
        int multiplier = 3;
        int multiplicand = 4;
        int expectedResult = 12;
        int actualResult = MathOperations.multiplication(multiplier, multiplicand);
        assertEquals(expectedResult, actualResult, "Multiplication with positive numbers should work correctly.");
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        int multiplier = -2;
        int multiplicand = 5;
        int expectedResult = -10;
        int actualResult = MathOperations.multiplication(multiplier, multiplicand);
        assertEquals(expectedResult, actualResult, "Multiplication with negative numbers should work correctly.");
    }
}

class MathOperations {
    public static int subtraction(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public static int multiplication(int multiplier, int multiplicand) {
        return multiplier * multiplicand;
    }
}