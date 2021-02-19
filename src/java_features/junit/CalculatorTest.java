package java_features.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void whenAddHundredToFiftyThenResultHundredFifty() {
        int expected2 = 150;
        int result2 = cal.plus(100, 50);
        assertEquals(expected2, result2);
    }

    @Test
    public void whenAddTenToFiveThenResultFifteen() {
        int expected = 15;
        int result = cal.plus(10, 5);
        assertEquals(expected, result);
    }

    @Test(expected = NumberFormatException.class)
    public void whenInputIncorrectValueThenThrowException() {
        cal.plus("hello", "3");
    }

    @Test
    public void minus() {
        int expected = 10;
        int result = cal.minus(20, 10);
        assertEquals(expected, result);
        int expected2 = 0;
        int result2 = cal.minus(200, 200);
        assertEquals(expected2, result2);
    }

    @Test
    public void mult() {
        double expected = 45;
        double result = cal.mult(9, 5);
        assertEquals(expected, result, 0.0001);
        double expected2 = 100;
        double result2 = cal.mult(10, 10);
        assertEquals(expected2, result2, 0.0001);
    }

    @Test
    public void qrt() {
        int expected = 100;
        int result = cal.qrt(10);
        assertEquals(expected, result);
        int expected2 = 400;
        int result2 = cal.qrt(20);
        assertEquals(expected2, result2);
    }

    @After
    public void close() {
        cal = null;
    }
}