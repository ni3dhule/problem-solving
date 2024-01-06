package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.FindSpecialPercentInteger;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindSpecialPercentIntegerTest {
    @Test
    public void shouldReturnSpecialIntegerFromSortedArray_Success(){
        int[] input = new int[]{1,2,2,6,6,6,6,7,10};
        int expectedInteger = 6;
        int actualInteger = FindSpecialPercentInteger.findSpecialInteger(input);
        Assertions.assertEquals(expectedInteger, actualInteger);
    }
}
