package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PolygonWithLargestPerimeterTest {
    @Test
    public void shouldReturnLongestPerimeterOfPolygon_Success(){
        int[] inputParameters = new int[]{5,5,5};
        long expectedPerimeter = 15;
        long actualPerimeter = PolygonWithLargestPerimeter.largestPerimeter(inputParameters);
        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }
}
