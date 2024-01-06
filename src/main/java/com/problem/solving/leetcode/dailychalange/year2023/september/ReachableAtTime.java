package com.problem.solving.leetcode.dailychalange.year2023.september;

public class ReachableAtTime {
    private ReachableAtTime(){}
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xDiff = Math.abs(sx - fx);
        int yDiff = Math.abs(sy - fy);

        if (xDiff == 0 && yDiff == 0 && t == 1) {
            return false;
        }

        return (Math.min(xDiff, yDiff) + Math.abs(xDiff - yDiff)) <= t;
    }
}
