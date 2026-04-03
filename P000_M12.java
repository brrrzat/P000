package org.example;

public class P000_M12 {

    static int expand(String s, int L, int R) {
        int count = 0;

        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            count++;
            L--;
            R++;
        }

        return count;
    }

    static int countPalSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);     // нечетные
            count += expand(s, i, i + 1); // четные
        }

        return count;
    }

    public static void main(String[] args) {
        String[] tests = {
                "aaa",
                "abc",
                "abba",
                "racecar",
                ""
        };

        for (String s : tests) {
            System.out.println(countPalSubstrings(s));
        }
    }
}