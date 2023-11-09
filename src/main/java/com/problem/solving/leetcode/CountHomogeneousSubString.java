package com.problem.solving.leetcode;

public class CountHomogeneousSubString {
    private CountHomogeneousSubString(){}
    public static int countHomogenous(String s) {
        char prev = '?';
        int cnt = 1;
        int sum = 0;

        for (char c : s.toCharArray()) {
            if (c != prev) {
                cnt = 1;
                prev = c;
            }
            sum = (sum + cnt++) % 1000000007;
        }
        return sum;
    }
}
