package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.NumberOfRolledDice;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberOfRolledDiceTest {
    @Test
    public void shouldReturnNumberOfRolledDice_Success(){
        int first = 1;
        int second = 6;
        int third = 3;
        int expectedResult = 1;
        int actualResult = NumberOfRolledDice.numRollsToTarget(first, second, third);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
