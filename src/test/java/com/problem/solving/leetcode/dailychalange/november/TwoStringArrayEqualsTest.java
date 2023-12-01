package com.problem.solving.leetcode.dailychalange.november;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TwoStringArrayEqualsTest {
    @Test
    public void shouldReturnTrueIfArrayEqual_Success(){
        String[] input1 = new String[]{"ab", "c"};
        String[] input2 = new String[]{"a", "bc"};
        boolean expectedResult = true;
        boolean actualResult = TwoStringArrayEquals.arrayStringsAreEqual(input1,input2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
