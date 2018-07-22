package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void testLongest() {
        LongestCommonPrefix l = new LongestCommonPrefix();

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