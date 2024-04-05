package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MakeMeaningFulWordTest {
    @Test
    public void shouldReturnMeaningFulWord_Success(){
        String input = "leEeetcode";
        String expectedWord = "leetcode";
        String actualWord = MakeMeaningFulWord.makeGood(input);
        Assertions.assertEquals(expectedWord, actualWord);
    }
}
