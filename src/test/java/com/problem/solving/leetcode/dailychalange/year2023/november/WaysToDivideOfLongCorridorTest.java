package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WaysToDivideOfLongCorridorTest {
    @Test
    public void shouldReturnNumberOfWaysOfLongCorridor_Success(){
        String input = "SSPPSPS";
        int expectedOutput = 3;
        int actualOutput = WaysToDivideOfLongCorridor.numberOfWays(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
