package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Count_and_SayTest {

    @Test
    public void testCountAndSay() {
        Count_and_Say c = new Count_and_Say();

        assertEquals("1", c.countAndSay(1));
        assertEquals("11", c.countAndSay(2));
        assertEquals("21", c.countAndSay(3));
        assertEquals("1211", c.countAndSay(4));
    }
}