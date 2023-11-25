package com.problem.solving.leetcode.dailychalange.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SumOfDifferenceOfSortedArrayTest {
    @Test
    public void shouldReturnSumOfDifferenceOfArray_Success(){
        int[] input = new int[]{2,3,5};
        int[] expectedResult = new int[]{4,3,5};
        int[] actualResult = SumOfDifferenceOfSortedArray.getSumAbsoluteDifferences(input);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
