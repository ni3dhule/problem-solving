package com.problem.solving.leetcode.dailychalange.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HammingWeightTest {
    @Test
    public void shouldReturnHammerWeight_Success(){
        int input = 00000000000000000000000000001011;
        int expectedOutput = 3;
        int actualOutput = HammingWeight.hammingWeight(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
