package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.NumberBreakDP;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberBreakDPTest {
    @Test
    public void breakNumberinKPositiveTestCase(){
        int number = 10;
        int expectedResult = 36;
        int actualResult = NumberBreakDP.integerBreak(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
