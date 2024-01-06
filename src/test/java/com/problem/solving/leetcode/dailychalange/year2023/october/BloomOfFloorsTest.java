package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.BloomOfFloors;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BloomOfFloorsTest {
    @Test
    public void getBloomOfFloorTestPositiveTestCase() {
        int[][] flowers = new int[][]{{1,6},{3,7},{9,12},{4,13}};
        int[] peoples = new int[]{2,3,7,11};
        int[] expectedResult =new int[]{1,2,2,2};

        int[]  actualResult = BloomOfFloors.fullBloomFlowers(flowers, peoples);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
