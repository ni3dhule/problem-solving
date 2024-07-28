package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondMinimumTimeToReachTest {
    @Test
    public void shouldReturnMinimumTimeToReachDestSuccess(){
        int n = 5;
        int[][] edges = new int[][]{{1,2}, {1,3}, {1,4}, {3,4}, {4,5}};
        int time = 3;
        int change = 5;
        assertEquals(13, SecondMinimumTimeToReach.secondMinimum(n, edges, time, change));
    }
}
