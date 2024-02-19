package com.problem.solving.leetcode.dailychalange.year2024.february;

public class PowerOfTwo {
    private PowerOfTwo(){}
    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}
