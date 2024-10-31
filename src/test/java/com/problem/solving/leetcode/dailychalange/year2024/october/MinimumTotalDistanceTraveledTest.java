package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MinimumTotalDistanceTraveledTest {
    @Test
    public void shouldReturnMinimumTotalDistanceSuccess(){
        assertEquals(4, MinimumTotalDistanceTraveled.minimumTotalDistance(Arrays.asList(0,4,6), new int[][]{{2,2}, {6,2}}));
    }
}
