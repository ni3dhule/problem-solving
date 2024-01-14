package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CheckClosestStringTest {
    @Test
    public void shouldReturnTwoStringAreClosestOrNot_Success(){
        String word1 = "abc";
        String word2 = "bca";
        boolean expectedResult = true;
        boolean actualResult = CheckClosestString.closeStrings(word1, word2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
