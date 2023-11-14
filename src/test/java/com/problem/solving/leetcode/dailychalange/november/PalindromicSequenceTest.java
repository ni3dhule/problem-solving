package com.problem.solving.leetcode.dailychalange.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PalindromicSequenceTest {
    @Test
    public void shouldReturnPalindromicSequenceCount_success(){
        String input = "aabca";
        int expectedPalindromicCount = 3;
        int actualPalindromicCount = PalindromicSequence.countPalindromicSubsequence(input);
        Assertions.assertEquals(expectedPalindromicCount, actualPalindromicCount);
    }

}
