package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AnagramValidationTest {
    @Test
    public void shouldReturnTrueIfAnagramValidation_Success(){
        String input1 = "anagram";
        String input2 = "nagaram";
        boolean expectedResult = true;;
        boolean actualResult = AnagramValidation.isAnagram(input1, input2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
