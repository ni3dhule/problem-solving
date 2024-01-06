package com.problem.solving.leetcode.dailychalange.year2023.september;

public class StringSubSequence {
    private StringSubSequence(){}
    public static boolean isSubSequence(String source, String destination) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < source.length() && j < destination.length()) {
            if (source.charAt(i) == destination.charAt(j)) {
                i++; j++;
                count++;
            }  else {
                j++;
            }
        }
        return source.length() == count;
    }
}
