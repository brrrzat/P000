package org.example;

public class P000_E01 {
    static int Func(int n) {
        n = Math.abs(n);

      return String.valueOf(Math.abs(n)).length();
    }

    public static void main(String[] args) {
        int[] tests = {0, 7, 42, 1000, -987654};
        for (int n : tests) {
            System.out.println(n + " -> " + Func(n));
        }
    }

}