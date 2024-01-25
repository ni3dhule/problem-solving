package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LongestCommonSequenceTest {
    @Test
    public void shouldReturnLongestLengthOfSubsequence_Success(){
        String word1 = "abcde";
        String word2 = "ace";
        int expectedOutput = 3;
        int actualOutput = LongestCommonSequence.longestCommonSubsequence(word1, word2);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
