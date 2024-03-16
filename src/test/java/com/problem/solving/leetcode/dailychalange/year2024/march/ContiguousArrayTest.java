package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ContiguousArrayTest {
    @Test
    public void shouldReturnContiguosArrayCount_Success() {
        int[] input = new int[]{0,1,0};
        int expectedArrayCount = 2;
        int actualArrayCount = ContiguousArray.findMaxLength(input);
        Assertions.assertEquals(expectedArrayCount, actualArrayCount);
    }
}
