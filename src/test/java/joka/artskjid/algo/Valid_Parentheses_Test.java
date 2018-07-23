package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Valid_Parentheses_Test {

    @Test
    public void testIsValid() {
        Valid_Parentheses v = new Valid_Parentheses();

        assertTrue(v.isValid("()"));
        assertTrue(v.isValid("()[]{}"));
        assertFalse(v.isValid("(]"));
        assertFalse(v.isValid("([)]"));
        assertTrue(v.isValid("{[]}"));
    }
}