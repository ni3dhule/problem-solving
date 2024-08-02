package com.problem.solving.leetcode.dailychalange.year2024.august;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MinimumSwapsForGroupTest {
    @Test
    public void shouldReturnSwapCountSuccess(){
        assertEquals(1, MinimumSwapsForGroup.minSwaps(new int[]{0,1,0,1,1,0,0}));
    }
}
