package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SortArrayByParityTest {
    @Test
    public void sortArrayByParity() {
        int[] input = new int[]{3,1,2,4};
        int[] expectedResult = new int[] {4,2,3,1};
        int[] actualResult = SortArrayByParity.getParitySortedArray(input);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
