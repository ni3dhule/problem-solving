package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HalvesStringsAreAlikeTest {
    @Test
    public void shouldReturnTrueIfHalveStringAreAlike_Success(){
        String input = "book";
        boolean expectedResult = true;
        boolean actualResult = HalvesStringsAreAlike.halvesAreAlike(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
