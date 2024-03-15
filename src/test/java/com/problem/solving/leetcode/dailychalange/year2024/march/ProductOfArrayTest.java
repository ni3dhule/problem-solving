package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ProductOfArrayTest {
    @Test
    public void shouldReturnProductOfArrayElementExceptSelf_Success(){
        int[] input = new int[]{1,2,3,4};
        int[] expectedProductArray = new int[]{24,12,8,6};
        int[] actualProductArray = ProductOfArray.productExceptSelf(input);
        Assertions.assertArrayEquals(expectedProductArray, actualProductArray);
    }
}
