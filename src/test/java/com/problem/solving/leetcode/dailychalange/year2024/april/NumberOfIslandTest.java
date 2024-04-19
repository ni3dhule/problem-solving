package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberOfIslandTest {
    @Test
    public void shouldReturnNumberOfIsland_Success(){
        char[][] input = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        Assertions.assertEquals(1, NumberOfIsland.numIslands(input));
    }
}
