package com.problem.solving.leetcode;

public class GoodPairOfNumbers {
    private GoodPairOfNumbers(){}
    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for(int i=0; i<nums.length; i++){
            int j = nums.length-1;
            while (i<j){
                if (nums[i] == nums[j]){
                    goodPairs++;
                }
                j--;
            }
        }
        return goodPairs;
    }
}
