package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAddingToMakeBalanceParenthesisTest {
    @Test
    public void shouldReturnMinimumAddToMakeBalanceParenthesisSuccess(){
        assertEquals(1, MinAddingToMakeBalanceParenthesis.minAddToMakeValid("())"));
    }
}
