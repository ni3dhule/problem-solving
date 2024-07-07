package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterBottlesTest {
    @Test
    public void shouldReturnTotalDrinkWaterBottlesSuccess() {
        int numberOfFullBottles = 9;
        int emptyBottlesExchangeNumber = 3;
        assertEquals(13,WaterBottles.numWaterBottles(numberOfFullBottles, emptyBottlesExchangeNumber));
    }
}
