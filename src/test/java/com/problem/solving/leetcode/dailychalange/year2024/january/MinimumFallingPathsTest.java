package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumFallingPathsTest {
    @Test
    public void shouldReturnMinimumFallingPath_Success(){
        int[][] input = new int[][] {{2,1,3},{6,5,4},{7,8,9}};
        int expectedMinFalling = 13;
        int actualMinFalling = MinimumFallingPaths.minFallingPathSum(input);
        Assertions.assertEquals(expectedMinFalling, actualMinFalling);
     }
}
