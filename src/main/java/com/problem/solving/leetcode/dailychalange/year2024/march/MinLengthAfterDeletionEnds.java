package com.problem.solving.leetcode.dailychalange.year2024.march;

public class MinLengthAfterDeletionEnds {
    private MinLengthAfterDeletionEnds(){}
    public static int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            char current = s.charAt(left);
            while (left <= right && s.charAt(left) == current) {
                left++;
            }
            while (right >= left && s.charAt(right) == current) {
                right--;
            }
        }
        return right - left + 1;
    }
}
