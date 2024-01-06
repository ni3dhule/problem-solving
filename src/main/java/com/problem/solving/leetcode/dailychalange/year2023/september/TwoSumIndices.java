package com.problem.solving.leetcode.dailychalange.year2023.september;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * ----------------------------------------------------------------------------------------------------------------
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * ----------------------------------------------------------------------------------------------------------------
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * ----------------------------------------------------------------------------------------------------------------
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *----------------------------------------------------------------------------------------------------------------
 */

public class TwoSumIndices {

    private TwoSumIndices(){}

    public static int[] getIndicesOfTwoSumElement(int[] inputArr, int target)  {
        Map<Integer, Integer> mapNumberIndex = new HashMap<>();
        int[] resultIndices = new int[2];
        for (int i=0; i< inputArr.length; i++) {
            int currentNumber = inputArr[i];
            int remainingNumber = target - currentNumber;
            if(!mapNumberIndex.containsKey(remainingNumber)){
                mapNumberIndex.put(currentNumber, i);
            } else {
                resultIndices[1] = i;
                resultIndices[0] = mapNumberIndex.get(remainingNumber);
                return resultIndices;
            }
        }
        return resultIndices;
    }
}
