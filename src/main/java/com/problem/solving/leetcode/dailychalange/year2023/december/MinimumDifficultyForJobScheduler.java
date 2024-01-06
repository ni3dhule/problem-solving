package com.problem.solving.leetcode.dailychalange.year2023.december;

import java.util.Arrays;

public class MinimumDifficultyForJobScheduler {
    private MinimumDifficultyForJobScheduler(){}
    public static int minDifficulty(int[] jobDifficulty, int d) {
        int length = jobDifficulty.length;
        if (d > length) return -1;

        int[][] minDifficulties = new int[d][length];
        for (int i = 1; i < d; ++i) {
            Arrays.fill(minDifficulties[i], Integer.MAX_VALUE);
        }

        int maxDiff = 0;
        int i = 0;
        while (i <= length - d) {
            maxDiff = Math.max(maxDiff, jobDifficulty[i]);
            minDifficulties[0][i] = maxDiff;
            ++i;
        }

        int currentDay = 1;
        while (currentDay < d) {
            int to = currentDay;
            while (to <= length - d + currentDay) {
                int currentJobDifficulty = jobDifficulty[to];
                int result = Integer.MAX_VALUE;
                int j = to - 1;
                while (j >= currentDay - 1) {
                    result = Math.min(result, minDifficulties[currentDay - 1][j] + currentJobDifficulty);
                    currentJobDifficulty = Math.max(currentJobDifficulty, jobDifficulty[j]);
                    --j;
                }
                minDifficulties[currentDay][to] = result;
                ++to;
            }
            ++currentDay;
        }
        return minDifficulties[d - 1][length - 1];
    }
}
