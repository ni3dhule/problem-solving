package com.problem.solving.leetcode.dailychalange.year2024.february;

public class FindMissingNumberInArray {
    private FindMissingNumberInArray(){}
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
