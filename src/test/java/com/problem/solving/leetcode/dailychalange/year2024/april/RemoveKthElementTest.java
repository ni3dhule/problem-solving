package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RemoveKthElementTest {
    @Test
    public void shouldRetunSmallestNumberAfterRemovingKElements_Success(){
        String number = "1432219";
        int k = 3;
        Assertions.assertEquals("1219", RemoveKthElement.removeKdigits(number, k));
    }
}
