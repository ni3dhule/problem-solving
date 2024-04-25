package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IdealLongestSequenceTest {
    @Test
    public void shouldReturnLongestIdealSequence_Success(){
        String input = "acfgbd";
        int k = 2;
        Assertions.assertEquals(4, IdealLongestSequence.longestIdealString(input, k));
    }
 }
