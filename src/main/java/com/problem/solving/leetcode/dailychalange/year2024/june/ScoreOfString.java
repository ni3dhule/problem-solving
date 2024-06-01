package com.problem.solving.leetcode.dailychalange.year2024.june;

public class ScoreOfString {
    private ScoreOfString(){}
    public static int scoreOfString(String s) {
        int total = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            total += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return total;
    }
}
