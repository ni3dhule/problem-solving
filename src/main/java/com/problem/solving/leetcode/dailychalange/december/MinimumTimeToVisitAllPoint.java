package com.problem.solving.leetcode.dailychalange.december;

public class MinimumTimeToVisitAllPoint {
    private MinimumTimeToVisitAllPoint(){}
    public static int toTime(int[] from, int[] to) {
        int xDiff = Math.abs(from[0] - to[0]);
        int yDiff = Math.abs(from[1] - to[1]);
        return Math.max(xDiff, yDiff);
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            time += toTime(points[i - 1], points[i]);
        }
        return time;
    }
}
