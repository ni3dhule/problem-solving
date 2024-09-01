package com.problem.solving.leetcode.dailychalange.year2024.september;
import java.util.Arrays;

public class Convert1DTo2DArray {
    private Convert1DTo2DArray(){}
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][];
        switch (m * n == original.length ? 1 : 0) {
            case 1:
                int i = 0;
                while (i < m) {
                    result[i] = Arrays.copyOfRange(original, i * n, i * n + n);
                    i++;
                }
                break;
            default:
                return new int[0][0];
        }
        return result;
    }
}
