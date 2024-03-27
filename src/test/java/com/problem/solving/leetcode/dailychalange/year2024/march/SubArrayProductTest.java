package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SubArrayProductTest {
    @Test
    public void shouldReturnProductOfSubArrayLessThanK_Success(){
        int[] input = new int[]{10,5,2,6};
        int k = 100;
        int expectedSubArrayCount = 8;
        int actualSubArrayCount = SubArrayProduct.numSubArrayProductLessThanK(input, k);
        Assertions.assertEquals(expectedSubArrayCount, actualSubArrayCount);
    }
}
