package com.problem.solving.leetcode.dailychalange.year2023.december;

public class TimeToMakeRope {
    private TimeToMakeRope(){}
    public static int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int i = 0;
        int j = 0;

        while (i < neededTime.length && j < neededTime.length) {
            int currTotal = 0;
            int currMax = 0;

            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                currTotal += neededTime[j];
                currMax = Math.max(currMax, neededTime[j]);
                j++;
            }

            totalTime += currTotal - currMax;
            i = j;
        }
        return totalTime;
    }
}
