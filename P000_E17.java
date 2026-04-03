package org.example;

import java.util.HashSet;

public class P000_E17 {
    static boolean hasPairWithSum(int[] a, int S) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : a) {
            int complement = S - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 7, 3};

        int[] testsS = {10, 8, 14, 20};
        for (int S : testsS) {
            System.out.println(hasPairWithSum(a, S));
        }
    }
}
