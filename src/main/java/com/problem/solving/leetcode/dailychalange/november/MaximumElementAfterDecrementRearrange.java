package com.problem.solving.leetcode.dailychalange.november;

import java.util.Arrays;

public class MaximumElementAfterDecrementRearrange {
    private MaximumElementAfterDecrementRearrange(){

    }
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int res = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > res) {
                ++res;
            }
        }
        return res;
    }
}
