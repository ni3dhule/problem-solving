package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PowerOfTwoTest {
    @Test
    public void shouldReturnTrueIfGivenNumberIdSquare_Success(){
        int inputNumber = 1;
        Assertions.assertTrue(PowerOfTwo.isPowerOfTwo(inputNumber));
    }
}
