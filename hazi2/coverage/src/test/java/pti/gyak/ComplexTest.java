package pti.gyak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void testF() {
        Complex complex = new Complex();
        assertEquals(354, complex.func(354, 400, 300));
    }
    @Test
    public void testTT() {
        Complex complex = new Complex();
        assertEquals(-698, complex.func(698, 4, 3));
    }
    @Test
    public void testTFT() {
        Complex complex = new Complex();
        assertEquals(3, complex.func(1000, 4, 3));
    }
    @Test
    public void testTFF() {
        Complex complex = new Complex();
        assertEquals(2, complex.func(1000, 2, 3));
    }
}