package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HouseRobberyTest {
    @Test
    public void shouldReturnMaximumRobbedAmount_Success(){
        int[] amount = new int[]{1,2,3,1};
        int maxRobbedAmount = 4;
        int actualRobbedAmount = HouseRobbery.rob(amount);
        Assertions.assertEquals(maxRobbedAmount, actualRobbedAmount);
    }
}
