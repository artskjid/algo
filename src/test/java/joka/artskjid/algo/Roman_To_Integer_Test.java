package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Roman_To_Integer_Test {

    @Test
    public void testRomanToInt() {
        Roman_To_Integer r = new Roman_To_Integer();

        assertEquals(3, r.romanToInt("III"));
        assertEquals(4, r.romanToInt("IV"));
        assertEquals(9, r.romanToInt("IX"));
        assertEquals(58, r.romanToInt("LVIII"));
        assertEquals(1994, r.romanToInt("MCMXCIV"));
    }
}