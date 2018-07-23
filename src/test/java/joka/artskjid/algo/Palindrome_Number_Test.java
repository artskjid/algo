package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome_Number_Test {

    @Test
    public void testIsPalindrome() {
        Palindrome_Number p = new Palindrome_Number();

        assertTrue(p.isPalindrome(5));
        assertTrue(p.isPalindrome(121));
        assertTrue(p.isPalindrome(12321));
        assertFalse(p.isPalindrome(122));
        assertFalse(p.isPalindrome(10));
    }
}