package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.DecodeWays;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DecodeWaysTest {
    @Test
    public void shouldReturnDecodedWays_Success(){
        String input = "12";
        int expectedResult = 2;
        int actualResult = DecodeWays.numDecodingWays(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
