package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.september.PowerOfFour;
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
