package com.problem.solving.leetcode.dailychalange.year2024.august;

import java.util.Arrays;

public class MakeTwoEqualArrays {
    private MakeTwoEqualArrays(){}
    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] cnt1 = new int[1001];
        int[] cnt2 = new int[1001];
        for (int v : target) {
            ++cnt1[v];
        }
        for (int v : arr) {
            ++cnt2[v];
        }
        return Arrays.equals(cnt1, cnt2);
    }
}
