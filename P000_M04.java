package org.example;

public class P000_M04 {

    static int maxSubarraySumKadane(int[] a) {
        int best = a[0];
        int current = a[0];

        for (int i = 1; i < a.length; i++) {
            current = Math.max(a[i], current + a[i]);
            best = Math.max(best, current);
        }

        return best;
    }

    public static void main(String[] args) {
        int[][] tests = {
                {1, -2, 3, 4, -1},
                {-5, -1, -8},
                {5, 4, 3},
                {2, -1, 2, -1, 2},
                {0, 0, 0}
        };

        for (int[] arr : tests) {
            System.out.println(maxSubarraySumKadane(arr));
        }
    }
}