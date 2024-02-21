package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BitwiseAndNumberRangeTest {
    @Test
    public void shouldReturnBitwiseNumber_Success(){
        int left = 5;
        int right = 7;
        int expectedBitwiseNumber = 4;
        int actualBitwiseNumber = BitwiseAndNumberRange.rangeBitwiseAnd(left, right);
        Assertions.assertEquals(expectedBitwiseNumber, actualBitwiseNumber);
    }
}
