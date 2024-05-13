package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixScoreTest {
    @Test
    public void shouldReturnMatrixScoreAfterFlippingSuccess(){
        int[][] grids = new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        assertEquals(39, MatrixScore.matrixScore(grids));
    }
}
