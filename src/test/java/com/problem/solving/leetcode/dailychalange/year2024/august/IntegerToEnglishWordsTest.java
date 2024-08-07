package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToEnglishWordsTest {
    @Test
    public void shouldReturnEnglishWordsFromIntegerSuccess(){
        int number = 123;
        assertEquals("One Hundred Twenty Three", IntegerToEnglishWords.numberToWords(number));
    }
}
