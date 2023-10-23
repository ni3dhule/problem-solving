package com.problem.solving.leetcode;

public class PowerOfFour {
    private PowerOfFour(){}
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        return Math.log(n) / Math.log(4) % 1 == 0;
    }
}
