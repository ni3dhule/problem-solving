package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ClimbingChairsTest {
    @Test
    public void shouldReturnNumberOfStepsToClimbChair_Success(){
        int steps = 2;
        int expectedSteps = 2;
        int actualSteps = ClimbingChairs.climbStairs(steps);
        Assertions.assertEquals(expectedSteps, actualSteps);
    }
}
