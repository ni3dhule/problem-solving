package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoneRemovalSameRowColTest {
    @Test
    public void shouldReturnStonesRemovedSuccess(){
        assertEquals(5, StoneRemovalSameRowCol.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}}));
    }
}
