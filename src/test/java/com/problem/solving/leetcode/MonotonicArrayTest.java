package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MonotonicArrayTest {
    @Test
    public void getMonotonicPositiveTestCase() {
        int[] inputs = new int[]{1, 2, 2, 3};
        boolean actualResult = MonotonicArray.isMonotonic(inputs);
        boolean expectedResult = true;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getMonotonicNegativeTestCase() {
        int[] inputs = new int[]{1, 3, 2};
        boolean actualResult = MonotonicArray.isMonotonic(inputs);
        boolean expectedResult = false;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
