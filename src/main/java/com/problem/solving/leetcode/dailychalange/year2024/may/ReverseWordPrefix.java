package com.problem.solving.leetcode.dailychalange.year2024.may;

public class ReverseWordPrefix {
    private ReverseWordPrefix() {

    }
    public static String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if (j != -1) {
            return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
        }
        return word;
    }
}
