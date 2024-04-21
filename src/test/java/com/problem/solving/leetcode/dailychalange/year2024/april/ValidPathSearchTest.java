package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ValidPathSearchTest {
    @Test
    public void shouldReturnTrueIfPathExist_Success() {
        int[][] edges = new int[][] {{0,1}, {1,2}, {2,0}};
        int n = 3;
        int source = 0;
        int destination = 2;
        Assertions.assertTrue(ValidPathSearch.validPath(n, edges, source, destination));
    }
}
