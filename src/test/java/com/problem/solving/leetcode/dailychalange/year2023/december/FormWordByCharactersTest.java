package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.FormWordByCharacters;
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
