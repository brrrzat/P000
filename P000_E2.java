package org.example;

public class P000_E2 {
    static int Func(int n) {
        n = Math.abs(n);
        if (n < 10) return n;
        return (n % 10) + Func(n / 10);
    }

    public static void main(String[] args) {
        int[] tests = {0, 7, 42, 1000, -987654};
        for (int n : tests) {
            System.out.println(n + " -> " + Func(n));
        }
    }

}
