package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IslandPerimeterTest {
    @Test
    public void shouldReturnPerimeterOfIsland_Success() {
        int[][] input = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        Assertions.assertEquals(16,IslandPerimeter.islandPerimeter(input));
    }
}
