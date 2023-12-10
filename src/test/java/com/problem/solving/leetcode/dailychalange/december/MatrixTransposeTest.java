package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MatrixTransposeTest {
    @Test
    public void shouldReturnsTransposesMatrix_Success(){
        int [][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] expectedResult = new int[][]{{1,4,7},{2,5,8},{3,6,9}};
        int [][] actualResult = MatrixTranspose.transpose(input);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
