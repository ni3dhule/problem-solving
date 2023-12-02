package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FormWordByCharactersTest {
    @Test
    public void shouldReturnTheWordFromCharacters(){
        String[] input = new String[]{"cat","bt","hat","tree"};
        String word = "atach";
        int expectedCount= 6;
        int actualCount = FormWordByCharacters.countCharacters(input, word);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
