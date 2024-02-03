package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumSumAfterPartitionedTest {
    @Test
    public void shouldReturnedMaxSumAfterArrayPartitioned_Success(){
        int[] input = new int[]{1,15,7,9,2,5,10};
        int k = 3;
        int expectedOutput = 84;
        int actualOutput = MaximumSumAfterPartitioned.maxSumAfterPartitioning(input, k);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
