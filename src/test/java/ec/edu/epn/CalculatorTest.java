package ec.edu.epn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void add_TwoPositiveNumbers_ReturnsCorrectSum() {
        int expected = 5;
        int calc = calculator.add(3, 2);
        assertEquals(expected, calc);
    }

    @Test
    void subtract_TwoPositiveNumbers_ReturnsCorrectResult() {
        int expected = 1;
        int calc = calculator.subtract(3, 2);
        assertEquals(expected, calc);
    }

    // -----------------------------
    //        DIVIDE TESTS
    // -----------------------------

    @Test
    void divide_TwoPositiveNumbers_ReturnsCorrectResult() {
        int expected = 2;
        double calc = calculator.divide(6, 3);
        assertEquals(expected, calc);
    }

    @Test
    void divide_ByZero_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    // -----------------------------
    //        isEven TESTS
    // -----------------------------

    @Test
    void isEven_EvenNumber_ReturnsTrue() {
        assertTrue(calculator.isEven(4));
    }

    @Test
    void isEven_OddNumber_ReturnsFalse() {
        assertFalse(calculator.isEven(5));
    }

    // Test que debe fallar
    @Test
    void isEven_NegativeOddNumber_ReturnsFalse() {
        assertFalse(calculator.isEven(-3)); // este debería pasar
    }

    // Test diseñado para fallar (ejemplo)
    @Test
    void isEven_TestDesignedToFail() {
        assertFalse(calculator.isEven(5)); // ESTO DEBE FALLAR
    }
}
