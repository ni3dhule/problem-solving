package com.problem.solving.leetcode.dailychalange.year2023.november;

import com.problem.solving.leetcode.dailychalange.november.FindUniqueBinaryString;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindUniqueBinaryStringTest {
    @Test
    public void shouldReturnFindUniqueBinaryString_Success(){
        String[] input = new String[]{"01","10"};
        String expectedResult = "00";
        String actualResult = FindUniqueBinaryString.findDifferentBinaryString(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
