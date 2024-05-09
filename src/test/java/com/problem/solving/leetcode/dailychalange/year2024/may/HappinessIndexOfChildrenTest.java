package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HappinessIndexOfChildrenTest {
    @Test
    public void shouldReturnHappinessIndexOfSelectedChildrenSuccess() {
        int[] happiness = new int[]{1,2,3};
        int k = 2;
        assertEquals(4, HappinessIndexOfChildren.maximumHappinessSum(happiness, k));
    }
}
