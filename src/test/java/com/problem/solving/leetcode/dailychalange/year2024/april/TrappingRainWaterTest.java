package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TrappingRainWaterTest {
    @Test
    public void shouldReturnUnitsOfTrappedWater_Success(){
        int[] waterUnits = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        Assertions.assertEquals(6, TrappingRainWater.trap(waterUnits));
    }
}
