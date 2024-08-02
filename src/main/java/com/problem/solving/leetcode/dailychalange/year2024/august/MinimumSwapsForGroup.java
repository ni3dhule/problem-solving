package com.problem.solving.leetcode.dailychalange.year2024.august;

import java.util.Arrays;

public class MinimumSwapsForGroup {
    private MinimumSwapsForGroup(){}
    public static int minSwaps(int[] nums) {
        int k = Arrays.stream(nums).sum();
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < k; ++i) {
            cnt += nums[i];
        }
        int mx = cnt;
        for (int i = k; i < n + k; ++i) {
            cnt += nums[i % n] - nums[(i - k + n) % n];
            mx = Math.max(mx, cnt);
        }
        return k - mx;
    }
}
