package com.problem.solving.leetcode.dailychalange.year2024.october;

public class MinSwapToBalancedString {
    private MinSwapToBalancedString(){}
    public static int minSwaps(String s) {
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[')
                size++;
            else if (size > 0)
                size--;
        }
        return (size + 1) / 2;
    }
}
