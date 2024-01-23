package com.problem.solving.leetcode.dailychalange.year2024.january;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxLengthOfUniqueConcatString {
    private MaxLengthOfUniqueConcatString(){}
    public static int maxLength(List<String> arr) {
        int[] maxLength = {0};
        backTrack(arr, "", 0, maxLength);
        return maxLength[0];
    }

    private static void backTrack(List<String> arr, String current, int start, int[] maxLength) {
        if (maxLength[0] < current.length())
            maxLength[0] = current.length();
        for (int i = start; i < arr.size(); i++) {
            if (!isValid(current, arr.get(i)))
                continue;
            backTrack(arr, current + arr.get(i), i + 1, maxLength);
        }
    }

    private static boolean isValid(String currentString, String newString) {
        Set<Character> charSet = new HashSet<>();

        for (char ch : newString.toCharArray()) {
            if (charSet.contains(ch)) {
                return false;
            }
            charSet.add(ch);

            if (currentString.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
}
