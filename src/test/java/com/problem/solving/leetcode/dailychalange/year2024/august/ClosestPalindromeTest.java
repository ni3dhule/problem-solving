package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosestPalindromeTest {
    @Test
    public void shouldReturnClosedPalindromeSuccess(){
        assertEquals("121", ClosestPalindrome.nearestPalindromic("123"));
    }
}
