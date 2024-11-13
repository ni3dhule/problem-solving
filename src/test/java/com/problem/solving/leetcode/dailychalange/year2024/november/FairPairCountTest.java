package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FairPairCountTest {
    @Test
    public void shouldReturnFairPairCountSuccess(){
        assertEquals(6, FairPairCount.countFairPairs(new int[]{0,1,7,4,4,5}, 3, 6));
    }
}
