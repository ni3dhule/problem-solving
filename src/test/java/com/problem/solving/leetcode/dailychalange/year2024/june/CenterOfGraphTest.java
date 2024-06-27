package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenterOfGraphTest {
    @Test
    public void shouldReturnCenterNodeSuccess(){
        int[][] edges = new int[][] {{1,2}, {2,3}, {4,2}};
        assertEquals(2, CenterOfGraph.findCenter(edges));
    }
}
