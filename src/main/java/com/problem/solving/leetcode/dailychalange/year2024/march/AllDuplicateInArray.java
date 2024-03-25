package com.problem.solving.leetcode.dailychalange.year2024.march;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateInArray {
    private AllDuplicateInArray(){
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if (nums[idx] < 0)
                result.add(num);
            nums[idx] *= -1;
        }
        return result;
    }
}
