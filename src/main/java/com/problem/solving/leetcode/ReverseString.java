package com.problem.solving.leetcode;

public class ReverseString {
    private ReverseString(){}
    public static String reverseInputString(String s) {
        StringBuilder sbResult = new StringBuilder();
        String[] inputs = s.split(" ");
        for (String input: inputs) {
            sbResult.append(new StringBuilder(input).reverse()).append(" ");
        }
        String result = sbResult.toString();
        return result.trim();
    }
}
