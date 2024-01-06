package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.BuyTwoChocolate;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BuyTwoChocolateTest {
    @Test
    public void shouldReturnLeftOverMoney_Success() {
        int[] prices = new int[]{1,2,2};
        int money = 3;
        int expectedResult = 0;
        int actualResult = BuyTwoChocolate.buyChoco(prices, money);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
