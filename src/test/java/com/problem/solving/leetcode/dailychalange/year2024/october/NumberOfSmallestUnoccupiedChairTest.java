package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfSmallestUnoccupiedChairTest {
    @Test
    public void shouldReturnNumberOfUnoccupiedChairsSuccess(){
        assertEquals(1, NumberOfSmallestUnoccupiedChair.smallestChair(new int[][]{{1,4},{2,3},{4,6}}, 1));
    }
}
