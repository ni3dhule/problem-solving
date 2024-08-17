package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfPointsTest {
    @Test
    public void shouldReturnMaximumNumberOfPointsSuccess(){
        assertEquals(9, MaximumNumberOfPoints.maxPoints(new int[][]{{1,2,3},{1,5,1},{3,1,1}}));
    }
}
