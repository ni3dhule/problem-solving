package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OnesZeroesDiferenceInMatrixGridTest {
    @Test
    public void shoudlReturnDifferenceOfOnesAndZeroes_Success(){
        int[][] input = new int[][]{{0,1,1},{1,0,1},{0,0,1}};
        int[][] expectedResult = new int[][]{{0,0,4}, {0,0,4},{-2,-2,2}};
        int[][] actualResult = OnesZeroesDiferenceInMatrixGrid.onesMinusZeros(input);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
