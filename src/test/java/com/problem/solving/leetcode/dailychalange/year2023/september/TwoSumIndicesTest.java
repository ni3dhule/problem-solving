package com.problem.solving.leetcode.dailychalange.year2023.september;

import com.problem.solving.leetcode.dailychalange.year2023.september.TwoSumIndices;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TwoSumIndicesTest {

    @Test
    public void getTwoSumIndicesTest1() {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        int[] actualResult = TwoSumIndices.getIndicesOfTwoSumElement(arr, target);
        int[] expectedResult = new int[]{0, 1};
        Assertions.assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    public void getTwoSumIndicesTest2() {
        int[] arr = new int[]{3, 2, 4};
        int target = 6;
        int[] actualResult = TwoSumIndices.getIndicesOfTwoSumElement(arr, target);
        int[] expectedResult = new int[]{1, 2};
        Assertions.assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    public void getTwoSumIndicesTest3() {
        int[] arr = new int[]{3, 3};
        int target = 6;
        int[] actualResult = TwoSumIndices.getIndicesOfTwoSumElement(arr, target);
        int[] expectedResult = new int[]{0, 1};
        Assertions.assertArrayEquals(actualResult, expectedResult);
    }


}
