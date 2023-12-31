package com.problem.solving.leetcode.dailychalange.year2023.december;

import java.util.Arrays;

public class VerticalAreaMaxWidth {
    private VerticalAreaMaxWidth(){}
    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int diff = 0;
        for (int i = 1; i < points.length; i++) {
            diff = Math.max(diff, points[i][0] - points[i - 1][0]);
        }
        return diff;
    }
}
