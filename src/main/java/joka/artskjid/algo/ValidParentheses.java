package joka.artskjid.algo;

public class ValidParentheses {

    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int ptr = -1;


        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[++ptr] = c;
            } else {
                if (ptr == -1) {
                    return false;
                }

                if (match(stack[ptr], c)) {
                    ptr--;
                } else {
                    return false;
                }
            }
        }

        return ptr == -1;
    }

    private boolean match(char x, char y) {
        return x == '(' && y == ')' || x == '[' && y == ']' || x == '{' && y == '}';
    }
}
