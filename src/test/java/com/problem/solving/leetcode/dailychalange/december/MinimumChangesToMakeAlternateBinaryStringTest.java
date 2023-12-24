package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumChangesToMakeAlternateBinaryStringTest {
    @Test
    public void shouldReturnMinNoOfOperationToMakeAlternateBinaryString_Success(){
        String input = "0100";
        int expectedOutput = 1;
        int actualOutput = MinimumChangesToMakeAlternateBinaryString.minOperations(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
