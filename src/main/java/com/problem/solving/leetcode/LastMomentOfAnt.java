package com.problem.solving.leetcode;

public class LastMomentOfAnt {
    private LastMomentOfAnt(){}
    public static int getLastMoment(int n, int[] left, int[] right) {
        int ans = 0;
        for (int num : left) {
            ans = Math.max(ans, num);
        }

        for (int num : right) {
            ans = Math.max(ans, n - num);
        }

        return ans;
    }
}
