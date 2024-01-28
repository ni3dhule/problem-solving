package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SumOfSubMatrixTargetTest {
    @Test
    public void shouldReturnTargetOfSubMatrix_Success(){
        int[][] input = new int[][]{{0,1,0},{1,1,1},{0,1,0}};
        int target = 0;
        int expectedOutput = 4;
        int actualOutput = SumOfSubMatrixTarget.numSubmatrixSumTarget(input, target);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
