package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CustomSortStringTest {
    @Test
    public void shouldReturnCustomSortedString_Success(){
        String order = "cba";
        String input = "abcd";
        String expectedSortedString = "cbad";
        String actualSortedString = CustomSortString.customSortString(order, input);
        Assertions.assertEquals(expectedSortedString, actualSortedString);
    }
}
