package joka.artskjid.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() {
        ValidParentheses v = new ValidParentheses();

        assertTrue(v.isValid("()"));
        assertTrue(v.isValid("()[]{}"));
        assertFalse(v.isValid("(]"));
        assertFalse(v.isValid("([)]"));
        assertTrue(v.isValid("{[]}"));
    }
}