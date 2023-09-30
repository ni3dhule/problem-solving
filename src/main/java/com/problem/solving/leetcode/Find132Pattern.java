package com.problem.solving.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Find132Pattern {
    private Find132Pattern(){}
    public static boolean is132Pattern(int[] nums){
        Deque<Integer> stack = new LinkedList<>();
        int third = Integer.MIN_VALUE;
        for (int i = nums.length-1 ; i >= 0; i--){
            if(nums[i] < third)
                return true;
            while(!stack.isEmpty() && stack.peek() < nums[i]){
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
