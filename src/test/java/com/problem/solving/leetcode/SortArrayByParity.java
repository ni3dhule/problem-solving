package com.problem.solving.leetcode;

import java.util.Arrays;

public class SortArrayByParity {
    private SortArrayByParity(){}
    public static  int[] getParitySortedArray(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if(nums[start] % 2 == 1 && nums[end] % 2 == 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            } else if (nums[start]%2 ==  0) {
                start++;
            } else if(nums[end]%2 == 1){
                end--;
            }
        }
        return nums;
    }
}
