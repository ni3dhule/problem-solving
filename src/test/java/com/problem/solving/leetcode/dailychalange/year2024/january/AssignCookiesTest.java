package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssignCookiesTest {
    @Test
    public void shouldReturnMaximumContentChildren_Success(){
        int[] greedFactor = new int[]{1,2,3};
        int[] cookieSize = new int[]{1,1};
        int expectedMaxChildren = 1;
        int actualMaxChildren = AssignCookies.findContentChildren(greedFactor, cookieSize);
        Assertions.assertEquals(expectedMaxChildren, actualMaxChildren);
    }
}
