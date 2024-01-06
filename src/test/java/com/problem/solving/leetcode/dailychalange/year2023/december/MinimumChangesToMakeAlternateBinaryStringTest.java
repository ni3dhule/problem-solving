package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.MinimumChangesToMakeAlternateBinaryString;
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
