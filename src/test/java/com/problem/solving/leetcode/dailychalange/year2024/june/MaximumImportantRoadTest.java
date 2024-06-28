package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumImportantRoadTest {
    @Test
    public void shouldReturnMaxImportantRoadValueSuccess(){
        int[][] roads = new int[][] {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
        int n = 5;
        assertEquals(43, MaximumImportantRoad.maximumImportance(n, roads));
    }
}
