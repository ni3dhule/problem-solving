package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FurthestBuildingCanReachTest {
    @Test
    public void shouldReturnFuurthestBuildingCanReached_Success(){
        int[] input = new int[]{4,2,7,6,9,14,12};
        int bricks = 6;
        int ladder = 1;
        int expectedFurthestBuilding = 4;
        int actualFurthestBuilding = FurthestBuildingCanReach.furthestBuilding(input, bricks, ladder);
        Assertions.assertEquals(expectedFurthestBuilding, actualFurthestBuilding);
    }
}
