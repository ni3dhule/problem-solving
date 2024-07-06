package com.problem.solving.leetcode.dailychalange.year2024.july;

public class PassThePillow {
    private PassThePillow(){}
    public static int passThePillow(int n, int time) {
        int chunks = time / (n - 1);
        return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
    }
}
