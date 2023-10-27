package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LongestPalindromeTest {
    @Test
    public void getLongestPalindromePositive() {
        String input = "babad";
        String expected = "bab";
        String actual = LongestPalindrome.longestPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
}
