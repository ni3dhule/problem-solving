package com.problem.solving.leetcode.dailychalange.year2024.june;

import java.util.Arrays;

public class HeightChecker {
    private HeightChecker(){}
    public static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                count++;
        }
        return count;
    }
}
