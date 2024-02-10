package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PalindromicSubstringsTest {
    @Test
    public void shouldReturnNumberOfPalindromicSubstrings(){
        String input = "abc";
        int expectedSubstringCount = 3;
        int actualSubStringCount = PalindromicSubstrings.countSubstrings(input);
        Assertions.assertEquals(expectedSubstringCount, actualSubStringCount);
    }
}
