package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.SpecialPositionInMatrix;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SpecialPositionInMatrixTest {
    @Test
    public void shouldReturnPositionInMatrix_Success(){
        int[][] input = new int[][] {{1,0,0},{0,0,1},{1,0,0}};
        int expectedPosition = 1;
        int actualPosition = SpecialPositionInMatrix.numSpecial(input);
        Assertions.assertEquals(expectedPosition, actualPosition);
    }
}
