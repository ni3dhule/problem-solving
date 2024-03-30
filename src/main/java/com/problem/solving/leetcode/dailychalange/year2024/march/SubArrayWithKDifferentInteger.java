package com.problem.solving.leetcode.dailychalange.year2024.march;

import java.util.HashMap;

public class SubArrayWithKDifferentInteger {
    private SubArrayWithKDifferentInteger(){}
    public static int subArraysWithKDistinct(int[] nums, int k) {
        int subWithMaxK = subarrayWithAtMostK(nums, k);
        int reducedSubWithMaxK = subarrayWithAtMostK(nums, k - 1);
        return subWithMaxK - reducedSubWithMaxK;
    }

    // Helper method to find the number of subarrays with at most k distinct elements
    public static int subarrayWithAtMostK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int ans = 0;
        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            ans += right - left + 1; // Size of subarray
            right++;
        }
        return ans;
    }
}
