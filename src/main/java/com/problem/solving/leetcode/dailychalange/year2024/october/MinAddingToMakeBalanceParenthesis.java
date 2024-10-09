package com.problem.solving.leetcode.dailychalange.year2024.october;

public class MinAddingToMakeBalanceParenthesis {
    private MinAddingToMakeBalanceParenthesis() {
    }

    public static int minAddToMakeValid(String s) {
        int open = 0, mismatch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                open++;
            else {
                if (open > 0)
                    open--;
                else
                    mismatch++;
            }
        }
        return open + mismatch;
    }
}
