package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MisMatchNumberTest {
    @Test
    public void shouldReturnFindErrorNumbers_Success(){
        int[] input = new int[]{1,2,2,4};
        int[] expectedOutput = new int[]{2,3};
        int[] actualOutput = MisMatchNumber.findErrorNums(input);
        Assertions.assertArrayEquals(expectedOutput,  actualOutput);
    }
}
