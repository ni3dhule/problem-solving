package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDaysToDisconnectIslandTest {
    Logger logger = LoggerFactory.getLogger(MinimumDaysToDisconnectIslandTest.class);
    @Test
    public void shouldReturnMinimumDaysSuccess() {
        assertEquals(2, MinimumDaysToDisconnectIsland.minDays(new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,0}}));
        logger.info("TEST CASE PASSED !");
    }
}
