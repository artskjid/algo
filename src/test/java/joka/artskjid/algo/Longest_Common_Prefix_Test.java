package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Longest_Common_Prefix_Test {

    @Test
    public void testLongest() {
        Longest_Common_Prefix l = new Longest_Common_Prefix();

        {
            String[] strs = {"flower", "flow", "flight"};
            assertEquals("fl", l.longestCommonPrefix(strs));
        }

        {
            String[] strs = {"dog", "racecar", "car"};
            assertEquals("", l.longestCommonPrefix(strs));
        }
    }

}