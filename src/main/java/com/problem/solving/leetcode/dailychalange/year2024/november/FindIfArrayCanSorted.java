package com.problem.solving.leetcode.dailychalange.year2024.november;

public class FindIfArrayCanSorted {
    private  FindIfArrayCanSorted(){}
    public static boolean canSortArray(int[] nums) {
        short pmax = 0, cmin = 0, cmax = 0;
        byte pcnt = 0;
        for (final int v : nums) {
            final byte ccnt = (byte)Integer.bitCount(v);
            if (pcnt == ccnt) {
                cmin = cmin > v ? (short)v : cmin;
                cmax = cmax < v ? (short)v : cmax;
            } else if (cmin < pmax) {
                return false;
            } else {
                pmax = cmax;
                cmin = cmax = (short)v;
                pcnt = ccnt;
            }
        }
        return cmin >= pmax;
    }
}