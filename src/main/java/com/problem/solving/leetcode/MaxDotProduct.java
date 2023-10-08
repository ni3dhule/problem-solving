package com.problem.solving.leetcode;

import java.util.Arrays;

public class MaxDotProduct {
    private MaxDotProduct(){}
    public static int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] current = new int[n + 1];
        int[] previous = new int[n + 1];
        Arrays.fill(current, Integer.MIN_VALUE);
        Arrays.fill(previous, Integer.MIN_VALUE);

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int currProduct = nums1[i - 1] * nums2[j - 1];
                current[j] = Math.max(Math.max(Math.max(currProduct, previous[j]), current[j - 1]), currProduct + Math.max(0, previous[j - 1]));
            }
            int[] temp = current;
            current = previous;
            previous = temp;
        }
        return previous[n];
    }
}
