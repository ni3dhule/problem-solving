package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindLongestIncreasingSubSequenceTest {
    @Test
    public void shouldReturnLengthOfLongestIncreasingSequence_Success(){
        int[] input = new int[]{10,9,2,5,3,7,101,18};
        int expectedLength = 4;
        int actualLength = FindLongestIncreasingSubSequence.lengthOfLIS(input);
        Assertions.assertEquals(expectedLength, actualLength);
    }
}
