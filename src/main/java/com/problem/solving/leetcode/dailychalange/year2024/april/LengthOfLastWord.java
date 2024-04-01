package com.problem.solving.leetcode.dailychalange.year2024.april;

public class LengthOfLastWord {
    private LengthOfLastWord(){}
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) continue;
            if (s.charAt(i) == ' ' && count != 0) return count;
            if (s.charAt(i) != ' ') count++;
        }
        return count;
    }
}
