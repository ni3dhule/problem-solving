package com.problem.solving.leetcode.dailychalange.november;

import java.util.Arrays;

public class MinMaxSumPair {
    private MinMaxSumPair() {
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n / 2; i++)
            max = Math.max(max, nums[i] + nums[n - i - 1]);
        return max;
    }
}
