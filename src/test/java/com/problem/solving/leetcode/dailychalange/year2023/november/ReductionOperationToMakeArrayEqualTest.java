package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReductionOperationToMakeArrayEqualTest {
    @Test
    public void shouldReturnReductionOperationCount_Success() {
        int[] input = new int[]{5, 1, 3};
        int expectedOutput = 3;
        int actualOutput = ReductionOperationToMakeArrayEqual.reductionOperations(input);
        Assertions.assertEquals(expectedOutput,actualOutput);
    }
}
