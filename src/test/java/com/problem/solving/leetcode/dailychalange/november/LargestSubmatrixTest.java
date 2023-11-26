package com.problem.solving.leetcode.dailychalange.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LargestSubmatrixTest {
    @Test
    public void shouldReturnLargestSubMatrix_Success(){
        int[][] input = new int[][] {{0,0,1}, {1,1,1}, {1,0,1}};
        int expectedOutput = 4;
        int actualOutput = LargestSubmatrix.largestSubmatrix(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
