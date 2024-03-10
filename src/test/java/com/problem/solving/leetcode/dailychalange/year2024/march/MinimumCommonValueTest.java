package com.problem.solving.leetcode.dailychalange.year2024.march;

import com.jayway.jsonpath.internal.function.numeric.Min;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumCommonValueTest {
    @Test
    public void shouldReturnCommonMinValue_Success(){
        int[] firstArray = new int[]{1,2,3};
        int[] secondArray = new int[] {2,4};
        int expectedCommonMin = 2;
        int actualCommonMin = MinimumCommonValue.getCommon(firstArray, secondArray);
        Assertions.assertEquals(expectedCommonMin, actualCommonMin);
    }
}
