package hw;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenOddNumberTest {


    @Test

    public void testEvenNumber() {
        boolean n = new EvenOddNumber().evenOddNumber(2);
        assertTrue(n = true);


    }
    @Test
    public void testOddNumber() {
        boolean result = new EvenOddNumber().evenOddNumber(3);
        assertFalse(result);
    }
    @Test
    public void testNegativeNumber() {
        boolean result = new EvenOddNumber().evenOddNumber(-4);
        assertTrue(result);
    }
    @Test
    public void testLargeNumber() {
        boolean result = new EvenOddNumber().evenOddNumber(1000000);
        assertTrue(result);
    }
}