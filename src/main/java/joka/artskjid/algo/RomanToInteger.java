package joka.artskjid.algo;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static Map<Character, Integer> symbols;

    static {
        symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
    }

    public int romanToInt(String s) {
        int prev = 0;
        int sign = 1;
        int ret = 0;

        char[] cs = s.toCharArray();

        for (int i=cs.length-1; i>=0; i--) {
            int curr = symbols.get(cs[i]);
            if (prev != 0 && curr < prev && sign == 1) {
                sign = -1;
            } else if (curr > prev && sign == -1) {
                sign = 1;
            }

            ret += sign * curr;
            prev = curr;
        }

        return ret;
    }
}
