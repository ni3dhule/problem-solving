package com.problem.solving.leetcode.dailychalange.year2024.march;

import java.util.Arrays;

public class SquareOfSortedArray {
    private SquareOfSortedArray(){}
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
