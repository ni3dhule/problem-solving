package com.problem.solving.leetcode.dailychalange.year2024.march;

import java.util.HashMap;

public class FirstMissingPositiveNumber {
    private FirstMissingPositiveNumber(){}
    public static int firstMissingPositive(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            mp.put(num, true);
            maxi = Math.max(maxi, num);
        }
        for (int i = 1; i < maxi; i++) {
            if (!mp.containsKey(i))
                return i;
        }
        return maxi < 0 ? 1 : maxi + 1;
    }
}
