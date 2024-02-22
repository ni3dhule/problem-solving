package com.problem.solving.leetcode.dailychalange.year2024.february;

public class FindTownJudge {
    private FindTownJudge(){}
    public static int findJudge(int n, int[][] trust) {
        int[] trusting = new int[n + 1];
        int[] trusted = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            trusting[trust[i][0]]++;
            trusted[trust[i][1]]++;
        }
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if (trusting[i] == 0 && trusted[i] == n - 1)
                ans = i;
        }
        return ans;
    }
}
