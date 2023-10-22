package com.problem.solving.leetcode;

public class MaximumScoreSubArray {
    private MaximumScoreSubArray(){

    }
    public static int maximumScore(int[] nums, int k) {
        int i = k - 1;
        int j = k + 1;
        int length = nums.length;
        int res = nums[k];
        int mn = nums[k];
        while (i >= 0 || j < length) {
            if (i < 0 || (j < length && nums[j] > nums[i])) {
                mn = Math.min(mn, nums[j]);
                ++j;
            } else {
                mn = Math.min(mn, nums[i]);
                --i;
            }
            res = Math.max(res, mn * (j - i - 1));
        }
        return res;
    }
}
