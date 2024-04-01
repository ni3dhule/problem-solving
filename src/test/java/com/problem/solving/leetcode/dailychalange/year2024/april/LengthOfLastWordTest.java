package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LengthOfLastWordTest {
    @Test
    public void shouldReturnLengthOfLastWord_Success(){
        String input = "Hello Klassen";
        int expectedLength = 7;
        int actualLength = LengthOfLastWord.lengthOfLastWord(input);
        Assertions.assertEquals(expectedLength, actualLength);
    }
}
