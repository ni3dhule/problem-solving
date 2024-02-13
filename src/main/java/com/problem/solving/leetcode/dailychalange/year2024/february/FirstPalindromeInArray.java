package com.problem.solving.leetcode.dailychalange.year2024.february;

public class FirstPalindromeInArray {
    private FirstPalindromeInArray(){}
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word).reverse();
            if (word.equals(reversed.toString())) {
                return word;
            }
        }
        return "";
    }
}
