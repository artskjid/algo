package joka.artskjid.algo;

public class Reserve_Integer {
    public int reverse(int x) {
        boolean negative = x < 0;
        int n = negative ? -x : x;
        long ret = 0;

        while (n > 0) {
            int r = n % 10;
            n /= 10;
            ret = ret * 10 + r;
        }

        if (ret > Integer.MAX_VALUE) {
            return 0;
        }

        return negative ? (int) -ret : (int) ret;
    }
}
