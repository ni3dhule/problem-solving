package com.problem.solving.leetcode.dailychalange.year2023.september;

import com.problem.solving.leetcode.dailychalange.year2023.september.ReverseString;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReverseStringTest {
    @Test
    public void reverseStringPositiveTestCase() {
        String input = "Let's take LeetCode contest";
        String expectedResult = "s'teL ekat edoCteeL tsetnoc";
        String actualResult = ReverseString.reverseInputString(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
