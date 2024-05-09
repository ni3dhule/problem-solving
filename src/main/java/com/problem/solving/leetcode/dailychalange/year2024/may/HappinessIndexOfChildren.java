package com.problem.solving.leetcode.dailychalange.year2024.may;

import java.util.Arrays;

public class HappinessIndexOfChildren {
    private HappinessIndexOfChildren(){}
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        int n = happiness.length, j = 0;
        for (int i = n - 1; i >= n - k; --i) {
            happiness[i] = Math.max(happiness[i] - j++, 0);
            res += happiness[i];
        }
        return res;
    }
}
