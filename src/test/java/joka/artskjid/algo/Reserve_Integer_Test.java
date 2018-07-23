package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Reserve_Integer_Test {

    @Test
    public void testReverse() {
        Reserve_Integer r = new Reserve_Integer();
        assertEquals(321, r.reverse(123));
        assertEquals(-321, r.reverse(-123));
        assertEquals(21, r.reverse(120));
        assertEquals(0, r.reverse(1534236469));
        assertEquals(0, r.reverse(1563847412));
    }
}