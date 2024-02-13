package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FirstPalindromeInArrayTest {
    @Test
    public void shouldReturnFirstPalindromeInGivenArray_Success(){
        String[] inputs = new String[]{"abc","car","ada","racecar","cool"};
        String expectedPalindrome = "ada";
        String actualPalindrome = FirstPalindromeInArray.firstPalindrome(inputs);
        Assertions.assertEquals(expectedPalindrome, actualPalindrome);
    }
}
