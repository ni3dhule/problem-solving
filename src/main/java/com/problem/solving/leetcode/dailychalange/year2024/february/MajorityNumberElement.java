package com.problem.solving.leetcode.dailychalange.year2024.february;

import java.util.HashMap;
import java.util.Map;

public class MajorityNumberElement {
    private MajorityNumberElement(){}
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }
}
