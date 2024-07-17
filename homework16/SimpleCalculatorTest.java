package homework16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {
    SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void testAdd() {
        assertEquals(6.0, calculator.add(1, 2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-4.0, calculator.subtract(1, 2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(1, 2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(1.0, calculator.divide(6, 2, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 1, 0));
    }
}

