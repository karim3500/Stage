import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculator2Test {
    Calculator2 calc;

    @BeforeEach
    public void init() {
        calc = new Calculator2();
    }

    @Test
    public void testAddNumbers1() {
        int result = calc.add(5, 7);

        assertEquals(12, result);
    }

    @Test
    public void testAddNumbers2() {
        int result = calc.add(7, 5);

        assertEquals(12, result);
    }

    @Test
    public void testAddNumbers3() {
        int result = calc.add(3, 2, 1);

        assertEquals(6, result);
    }

    @Test
    public void testAddNumbers4() {
        int result = calc.add(5, 2, 100);

        assertEquals(107, result);
    }

    @Test
    public void testAddNumbers5() {
        int result = calc.add(2, 0, 5, 100);

        assertEquals(107, result);
    }

    @Test
    public void testAddNumbers6() {
        int result = calc.add(8, 101, 30, 1000);

        assertEquals(1038, result);
    }

    @Test
    public void testAddNumbers7() {
        int result = calc.add(6, 7);

        assertEquals(13, result);
    }

    @Test
    public void testAddNumbers8() {
        int result = calc.add(5);

        assertEquals(5, result);
    }

    @Test
    public void testAddNumbers9() {
        int result = calc.add(9);

        assertEquals(9, result);
    }
}