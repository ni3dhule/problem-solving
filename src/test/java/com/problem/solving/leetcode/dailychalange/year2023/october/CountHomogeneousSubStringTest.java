package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.CountHomogeneousSubString;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CountHomogeneousSubStringTest {
    @Test
    public void shouldReturCountOfHomogeneousSubString(){
        String input = "abbcccaa";
        int expectedOutput = 13;
        int actualOutput = CountHomogeneousSubString.countHomogenous(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
