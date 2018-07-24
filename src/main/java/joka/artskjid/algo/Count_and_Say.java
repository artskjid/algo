package joka.artskjid.algo;

public class Count_and_Say {
    public String countAndSay(int n) {
        String s = "1";

        while (n > 1) {
            StringBuilder acc = new StringBuilder();

            char curr = '\0';
            int cnt = 0;
            for (char c: s.toCharArray()) {
                if (curr == '\0') {
                    cnt = 1;
                    curr = c;
                } else if (c == curr) {
                    cnt++;
                } else {
                    acc.append(cnt).append(curr);
                    curr = c;
                    cnt = 1;
                }
            }

            if (curr != '\0') {
                acc.append(cnt).append(curr);
            }

            s = acc.toString();
            acc.setLength(0);
            n--;
        }

        return s;
    }
}
