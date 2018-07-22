package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {
        RomanToInteger r = new RomanToInteger();

        assertEquals(3, r.romanToInt("III"));
        assertEquals(4, r.romanToInt("IV"));
        assertEquals(9, r.romanToInt("IX"));
        assertEquals(58, r.romanToInt("LVIII"));
        assertEquals(1994, r.romanToInt("MCMXCIV"));
    }
}