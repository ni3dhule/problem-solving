package com.problem.solving.leetcode.dailychalange.year2023.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LargestSubStringBetweenTwoEqualCharTest {
    @Test
    public void shouldReturnLengthOfSubStringBetweenEqualCharacters_Success() {
        String inputString = "aa";
        int expectedResult = 0;
        int actualResult = LargestSubStringBetweenTwoEqualChar.maxLengthBetweenEqualCharacters(inputString);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
