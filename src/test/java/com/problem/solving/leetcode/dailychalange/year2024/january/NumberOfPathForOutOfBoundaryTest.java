package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberOfPathForOutOfBoundaryTest {
    @Test
    public void shouldReturnNumberOfPathForOutOfBoundary_Success(){
        int m = 2;
        int n = 2;
        int maxMove = 2;
        int startRow = 0;
        int startColumn = 0;
        int expectedNumberOfPath = 6;
        int actualNnumberOfPath = NumberOfPathForOutOfBoundary.findPaths(m,n,maxMove,startRow, startColumn);
        Assertions.assertEquals(expectedNumberOfPath,actualNnumberOfPath);
    }
}
