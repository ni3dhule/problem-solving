package com.problem.solving.leetcode.dailychalange.year2024.september;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubStringWithVowelsTest {
    @Test
    public void shouldReturnLengthOfLonestSubStringVowelsSuccess(){
        assertEquals(13, LongestSubStringWithVowels.findTheLongestSubstring("eleetminicoworoep"));
    }
}
