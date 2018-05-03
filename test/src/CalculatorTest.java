import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testAddNumbers1() {
        Calculator calc = new Calculator();
        int result = calc.add(1, 1);

        assertEquals(2, result);
    }

    @Test
    public void testAddNumbers2() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);

        assertEquals(8, result);
    }

    @Test
    public void testAddNullThrowsError1() {
        Calculator calc = new Calculator();
        assertThrows(NullPointerException.class, () -> calc.add(1, null));
    }

    @Test
    public void testAddNullThrowsError2() {
        Calculator calc = new Calculator();
        assertThrows(NullPointerException.class, () -> calc.add(null, 1));
    }

    @Test
    public void testSubtractNumbers1() {
        Calculator calc = new Calculator();
        int result = calc.subtract(1, 2);

        assertEquals(-1, result);
    }

    @Test
    public void testSubtractNumbers2() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 7);

        assertEquals(3, result);
    }
}
