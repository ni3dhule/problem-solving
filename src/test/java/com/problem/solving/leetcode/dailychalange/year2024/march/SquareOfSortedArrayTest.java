package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SquareOfSortedArrayTest {
    @Test
    public void shouldReturnTheSquareOfSortedArray_Success(){
        int[] input = new int[]{-4,-1,0,3,10};
        int[] expectedSquareArray = {0,1,9,16,100};
        int[] actualSquareArray = SquareOfSortedArray.sortedSquares(input);
        Assertions.assertArrayEquals(expectedSquareArray, actualSquareArray);
    }
}
