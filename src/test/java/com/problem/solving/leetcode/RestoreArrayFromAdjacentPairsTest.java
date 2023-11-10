package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RestoreArrayFromAdjacentPairsTest {
    @Test
    public void shouldReturnRestoredArray(){
        int[][] input = new int[][] {{2,1},{3,4},{3,2}};
        int[] expectedOutput = new int[]{1,2,3,4};
        int[] actualOutput = RestoreArrayFromAdjacentPairs.restoreArray(input);
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}
