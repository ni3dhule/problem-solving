package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumScoreWordsTest {
    @Test
    public void shouldReturnMaxScoreWordSuccess(){
        String[] words = new String[]{"dog","cat","dad","good"};
        char[] letters = new char[]{'a','a','c','d','d','d','g','o','o'};
        int[] score = new int[]{1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(23, MaximumScoreWords.maxScoreWords(words, letters , score));
    }
}
