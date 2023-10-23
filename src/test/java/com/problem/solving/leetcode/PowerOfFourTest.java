package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PowerOfFourTest {
    @Test
    public void testPowerOfFour(){
        int input = 16;
        boolean expectedResult = true;
        boolean actaulResult = PowerOfFour.isPowerOfFour(input);
        Assertions.assertTrue(actaulResult == expectedResult);
    }
}
