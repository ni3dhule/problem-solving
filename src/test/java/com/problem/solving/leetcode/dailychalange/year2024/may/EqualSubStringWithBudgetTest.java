package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualSubStringWithBudgetTest {
    @Test
    public void shouldReturnBudgetSuccess(){
        assertEquals(3, EqualSubStringWithBudget.equalSubstring("abcd", "bcdf", 3));
    }
}
