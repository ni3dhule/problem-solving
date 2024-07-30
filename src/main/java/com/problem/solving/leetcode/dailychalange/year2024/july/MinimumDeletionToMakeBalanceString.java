package com.problem.solving.leetcode.dailychalange.year2024.july;

import com.problem.solving.leetcode.dailychalange.year2024.june.MinimumFlips;

public class MinimumDeletionToMakeBalanceString {
    private MinimumDeletionToMakeBalanceString(){}
    public static int minimumDeletions(String s) {
        int res = 0, count = 0;
        for (char c : s.toCharArray()){
            if (c == 'b')
                count++;
            else if (count != 0){
                res++;
                count--;
            }
        }
        return res;
    }
}
