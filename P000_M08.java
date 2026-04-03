package org.example;

public class P000_M08 {

    static int countIncreasingTriplets(int[] a) {
        int n = a.length;
        int count = 0;

        for (int j = 0; j < n; j++) {
            int left = 0;
            int right = 0;

            for (int i = 0; i < j; i++) {
                if (a[i] < a[j]) left++;
            }

            for (int k = j + 1; k < n; k++) {
                if (a[k] > a[j]) right++;
            }

            count += left * right;
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] tests = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {1, 5, 2, 4, 3},
                {2, 2, 2},
                {-1, 0, 1, 2}
        };

        for (int[] arr : tests) {
            System.out.println(countIncreasingTriplets(arr));
        }
    }
}
