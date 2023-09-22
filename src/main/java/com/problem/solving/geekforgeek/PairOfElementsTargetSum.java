package com.problem.solving.geekforgeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairOfElementsTargetSum {
    //Find a pair with the given sum in an array
    private PairOfElementsTargetSum(){}
    public static List<String> getPairsOfElementForTargetSum(int []nums, int target) {
        // sort the given array and check the pair of item with sum = target element
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        String pair;
        ArrayList<String> result = new ArrayList<>();

        while(left < right) {
            if(nums[left]+nums[right] == target) {
                pair = "("+nums[left]+","+nums[right]+")";
                result.add(pair);
                left++;
                right--;
            }else if (nums[left]+nums[right] < target) {
                left++;
            } else {
                right++;
            }
        }

        return result;
    }
}
