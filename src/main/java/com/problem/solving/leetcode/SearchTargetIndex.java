package com.problem.solving.leetcode;

public class SearchTargetIndex {
    private SearchTargetIndex(){}
    public static int[] searchRange(int[] nums, int target) {
        int low = -1;
        int high = -1;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == target) {
                low = i;
                while(i< nums.length && nums[i] == target) {
                    i++;
                }
                high = i-1;
                return new int[]{low, high};
            }
        }
        return new int[]{low, high};
    }
}
