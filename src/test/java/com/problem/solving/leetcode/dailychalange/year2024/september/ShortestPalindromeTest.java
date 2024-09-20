package com.problem.solving.leetcode.dailychalange.year2024.september;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPalindromeTest {
    @Test
    public void shouldReturnShortestPalindromeSuccess(){
        assertEquals("aaacecaaa", ShortestPalindrome.shortestPalindrome("aacecaaa"));
    }
}
