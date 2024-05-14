package com.problem.solving.leetcode.dailychalange.year2024.may;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxGoldPathTest {
    @Test
    public void shouldReturnMaxPathForGoldSuccess() {
        int[][] grid = new int[][]{{0,6,0},{5,8,7},{0,9,0}};
        assertEquals(24, MaxGoldPath.getMaximumGold(grid));
    }
}
