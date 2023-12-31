package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.NumberOfWaysForSamePosition;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberOfWaysForSamePositionTest {
    @Test
    public void getNumberOfWaysToSamePosition () {
        int steps = 2;
        int arrLen = 4;
        int expected = 2;
        int actualResult = NumberOfWaysForSamePosition.numWays(steps, arrLen);
        Assertions.assertEquals(expected, actualResult);
    }
}
