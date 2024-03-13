package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindPivotIntegerTest {
    @Test
    public void shouldReturnPivotElement_Success(){
        int input = 8;
        int expectedPivotInteger = 6;
        int actualPivotInteger = FindPivotInteger.pivotInteger(input);
        Assertions.assertEquals(expectedPivotInteger, actualPivotInteger);
    }
}
