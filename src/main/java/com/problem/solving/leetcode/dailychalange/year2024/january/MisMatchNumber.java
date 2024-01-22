package com.problem.solving.leetcode.dailychalange.year2024.january;

public class MisMatchNumber {
    private MisMatchNumber(){}
    public static int[] findErrorNums(int[] nums) {
        int dup = -1;
        int missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        return new int[] {dup, missing};
    }
}
