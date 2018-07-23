package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Implement_StrStr_Test {
    @Test
    public void test() {
        Implement_strStr i = new Implement_strStr();

        assertEquals(2, i.strStr("hello", "ll"));
    }

}