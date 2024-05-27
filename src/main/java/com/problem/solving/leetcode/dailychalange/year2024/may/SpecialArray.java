package com.problem.solving.leetcode.dailychalange.year2024.may;

import java.util.Arrays;

public class SpecialArray {
    private SpecialArray(){}
    public static int specialArray(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        if (numbers[0] >= n) return n;
        for (int i = 1; i <= n; i++) {
            if (numbers[n - i] >= i && (n - i - 1 < 0 || numbers[n - i - 1] < i)) {
                return i;
            }
        }
        return -1;
    }
}
