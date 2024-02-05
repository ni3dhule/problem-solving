package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FirstUniqueCharacterInStringTest {
    @Test
    public void shouldReturnIndexOfUniqueCharacterInStringInput_Success(){
        String input = "leetcode";
        int expectedIndex = 0;
        int actualIndex = FirstUniqueCharacterInString.firstUniqueChar(input);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }
}
