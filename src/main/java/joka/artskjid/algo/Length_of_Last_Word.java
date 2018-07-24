package joka.artskjid.algo;

public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        int i = s.length() -1;

        while (i >=0 && s.charAt(i) == ' ') i--;
        if (i < 0) return 0;

        int len = 0;
        while (i >= 0 && s.charAt(i) != ' ')  {
            len++;
            i--;
        }

        return len;
    }
}
