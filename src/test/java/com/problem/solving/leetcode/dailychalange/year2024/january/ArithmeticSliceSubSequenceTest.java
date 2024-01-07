package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArithmeticSliceSubSequenceTest {
    @Test
    public void shouldReturnNumberOfSlices_Success(){
        int[] input = new int[]{2,4,6,8,10};
        int expectedSliceNumber = 7;
        int actualSliceNumber = ArithmeticSliceSubSequence.numberOfArithmeticSlices(input);
        Assertions.assertEquals(expectedSliceNumber, actualSliceNumber);
    }
}
