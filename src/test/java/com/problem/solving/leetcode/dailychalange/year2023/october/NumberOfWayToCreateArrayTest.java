package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.NumberOfWayToCreateArray;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberOfWayToCreateArrayTest {
    @Test
    public void findNumberOfArraysCountPositiveTestCase() {
        int n = 2, m = 3, k = 1;
        int expectedResult = 6;
        int actualResult = NumberOfWayToCreateArray.numOfArrays(n, m, k);
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
