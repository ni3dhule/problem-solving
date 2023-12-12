package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumProductFromGivenArrayTest {
    @Test
    public void shouldReturnMaximumProductFromArrayItem_Success(){
        int[] input = new int[]{3,4,5,2};
        int expectedResult = 12;
        int actualResult = MaximumProductFromGivenArray.maxProduct(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
