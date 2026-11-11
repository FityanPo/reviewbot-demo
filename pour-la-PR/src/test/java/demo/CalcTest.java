package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcTest {

    private final Calc calc = new Calc();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(3, calc.divide(6, 2));
    }

    @Test
    void describesOne() {
        assertEquals("deux", calc.describe(1)); // test volontairement faux
    }
}
