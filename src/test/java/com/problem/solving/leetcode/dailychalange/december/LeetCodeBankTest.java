package com.problem.solving.leetcode.dailychalange.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LeetCodeBankTest {
    @Test
    public void shouldReturnTotalMoney_Success(){
        int input = 4;
        int expectedMoney = 10;
        int actualMoney = LeetCodeBank.totalMoney(input);
        Assertions.assertEquals(expectedMoney, actualMoney);
    }

}
