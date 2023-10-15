package com.problem.solving.hackerrank;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SuperReducedStringTest {
    @Test
    public void getSuperReducedStringPositiveTestCase() {
        String input = "baab";
        String expectedResult = "Empty String";
        String actualResult = SuperReducedString.superReducedString(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
