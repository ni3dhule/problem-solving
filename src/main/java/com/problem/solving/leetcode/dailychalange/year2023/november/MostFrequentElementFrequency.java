package com.problem.solving.leetcode.dailychalange.year2023.november;

import java.util.Arrays;

public class MostFrequentElementFrequency {
    private MostFrequentElementFrequency(){}
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxFreq = 0;
        int left = 0;
        long sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while ((long) nums[right] * (right - left + 1) > sum + k) {
                sum -= nums[left];
                left++;
            }
            maxFreq = Math.max(maxFreq, right - left + 1);
        }
        return maxFreq;
    }
}
