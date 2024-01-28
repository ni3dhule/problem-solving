package com.problem.solving.leetcode.dailychalange.year2024.january;

public class SumOfSubMatrixTarget {
    private SumOfSubMatrixTarget(){}
    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;
        for (int l = 0; l < n; ++l) {
            int[] sums = new int[105];
            for (int r = l; r < n; ++r) {
                for (int i = 0; i < m; ++i) {
                    sums[i] += matrix[i][r];
                }
                for (int i = 0; i < m; ++i) {
                    int sum = 0;
                    for (int j = i; j < m; ++j) {
                        sum += sums[j];
                        if (sum == target) {
                            ++res;
                        }
                    }
                }
            }
        }
        return res;
    }
}
