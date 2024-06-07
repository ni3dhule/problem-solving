package com.problem.solving.leetcode.dailychalange.year2024.june;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceWordsTest {
    @Test
    public void shouldReturnReplacedSentence(){
        List<String> dictionary = Arrays.asList("cat","bat","rat");
        String sentence = "the cattle was rattled by the battery";
        assertEquals("the cat was rat by the bat", ReplaceWords.replaceWords(dictionary, sentence));
    }
}
