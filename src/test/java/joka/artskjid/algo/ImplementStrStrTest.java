package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementStrStrTest {
    @Test
    public void test() {
        ImplementStrStr i = new ImplementStrStr();

        assertEquals(2, i.strStr("hello", "ll"));
    }

}