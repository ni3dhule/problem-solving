package com.problem.solving.leetcode.dailychalange.year2024.september;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTimeDifferenceTest {
    @Test
    public void shouldReturnMinimumDistanceTimeSuccess(){
        assertEquals(1, MinimumTimeDifference.findMinDifference(Arrays.asList("23:59", "00:00")));
    }
}
