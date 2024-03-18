package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumArrowsToBurstBalloonsTest {
    @Test
    public void shouldReturnMinimumArrowsToBurstBallons_Success(){
        int[][] input = new int[][] {{10,16},{2,8},{1,6},{7,12}};
        int expectedMinArrows = 2;
        int actualMinArrows = MinimumArrowsToBurstBalloons.findMinArrowShots(input);
        Assertions.assertEquals(expectedMinArrows, actualMinArrows);
    }
}
