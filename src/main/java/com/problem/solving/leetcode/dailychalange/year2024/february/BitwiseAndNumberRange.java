package com.problem.solving.leetcode.dailychalange.year2024.february;

public class BitwiseAndNumberRange {
    private BitwiseAndNumberRange(){}
    public static int rangeBitwiseAnd(int left, int right) {
        int rightShiftcnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            rightShiftcnt++;
        }
        return (left << rightShiftcnt);
    }
}
