package com.problem.solving.leetcode.dailychalange.year2024.may;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RescueBoatsTest {
    @Test
    public void shouldReturnCountOfRescueBoatsSuccess(){
        int[] peoples = new int[]{1,2};
        int limit = 3;
        assertEquals(1, RescueBoats.numRescueBoats(peoples, limit));
    }
}
