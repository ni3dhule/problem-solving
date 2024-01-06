package com.problem.solving.leetcode.dailychalange.year2023.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinMaxSumPairTest {
    @Test
    public void shouldReturnMinMaxPair_Success(){
        int[] input = new int[]{3,5,2,3};
        int expectedMinimizedMaxSum = 7;
        int actualMinimizedMaxSum = MinMaxSumPair.minPairSum(input);
        Assertions.assertEquals(expectedMinimizedMaxSum, actualMinimizedMaxSum);
    }
}
