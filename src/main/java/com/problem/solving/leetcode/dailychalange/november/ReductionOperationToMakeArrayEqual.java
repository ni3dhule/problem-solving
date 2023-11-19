package com.problem.solving.leetcode.dailychalange.november;

import java.util.Arrays;

public class ReductionOperationToMakeArrayEqual {
    private ReductionOperationToMakeArrayEqual(){}

    public static int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int curr=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                curr++;
            }
            res = res + curr;
        }
        return res;
    }
}
