package com.problem.solving.leetcode.dailychalange.year2024.april;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MinimumFallingPathTest {
    @Test
    public void shouldReturnMinimumFallingPath_Success() {
        int[][] grid = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        assertEquals(13, MinimumFallingPath.minFallingPathSum(grid));
    }

}
