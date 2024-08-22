package com.problem.solving.leetcode.dailychalange.year2024.august;

public class NumberComplement {
    private NumberComplement(){}
    public static int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();

        int mask = (1 << bitLength) - 1;

        return num ^ mask;
    }
}
