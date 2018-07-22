package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReserveIntegerTest {

    @Test
    public void testReverse() {
        ReserveInteger r = new ReserveInteger();
        assertEquals(321, r.reverse(123));
        assertEquals(-321, r.reverse(-123));
        assertEquals(21, r.reverse(120));
        assertEquals(0, r.reverse(1534236469));
        assertEquals(0, r.reverse(1563847412));
    }
}