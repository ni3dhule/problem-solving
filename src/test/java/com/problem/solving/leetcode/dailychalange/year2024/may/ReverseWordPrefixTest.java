package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordPrefixTest {
    @Test
    public void shouldReturnReversedWordPrefix_Success() {
        String word = "abcdefd";
        char character = 'd';
        assertEquals("dcbaefd", ReverseWordPrefix.reversePrefix(word, character));
    }
}
