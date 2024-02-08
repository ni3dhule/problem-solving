package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PerfectSquareTest {
    @Test
    public void shouldReturnNumberOfPerfectSqaureInArray_Success(){
        int input = 12;
        int expectedPerfectSquares = 3;
        int actualPerfectSquares = PerfectSquare.numSquares(input);
        Assertions.assertEquals(expectedPerfectSquares, actualPerfectSquares);
    }
}
