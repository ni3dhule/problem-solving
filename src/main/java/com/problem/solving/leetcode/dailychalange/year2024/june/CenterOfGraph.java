package com.problem.solving.leetcode.dailychalange.year2024.june;

public class CenterOfGraph {
    private CenterOfGraph() {
    }
    public static int findCenter(int[][] e) {
        return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
    }
}
