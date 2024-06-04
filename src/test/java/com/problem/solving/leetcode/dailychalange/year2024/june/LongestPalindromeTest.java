package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
    @Test
    public void shouldReturnLengthOfPalindromeSuccess(){
        assertEquals(7, LongestPalindrome.longestPalindrome("abccccdd"));
    }
}
