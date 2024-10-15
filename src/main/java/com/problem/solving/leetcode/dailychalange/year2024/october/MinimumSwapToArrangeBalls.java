package com.problem.solving.leetcode.dailychalange.year2024.october;

public class MinimumSwapToArrangeBalls {
    private MinimumSwapToArrangeBalls(){}
    public static long minimumSteps(String s) {
        long swap = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                swap += (long) black;
            else
                black++;
        }
        return swap;
    }
}
