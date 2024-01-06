package com.problem.solving.leetcode.dailychalange.year2023.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VerticalAreaMaxWidthTest {
    @Test
    public void shouldReturnMaxVerticalWidth_Success(){
        int[][] input = new int[][]{{8,7},{9,9},{7,4},{9,7}};
        int expectedVerticalWidth = 1;
        int actualVerticalWidth = VerticalAreaMaxWidth.maxWidthOfVerticalArea(input);
        Assertions.assertEquals(expectedVerticalWidth, actualVerticalWidth);
    }
}
