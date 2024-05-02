package com.problem.solving.leetcode.dailychalange.year2024.may;

import java.util.Arrays;

public class LargestPositiveWithItsNegative {
    private LargestPositiveWithItsNegative(){}
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0) {
                return nums[i];
            }
        }
        return -1;
    }
}
