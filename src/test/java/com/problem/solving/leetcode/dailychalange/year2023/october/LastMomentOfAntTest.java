package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.LastMomentOfAnt;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LastMomentOfAntTest {
    @Test
    public void shouldReturnLastMomentOfAnt(){
        int n = 4;
        int[] left = new int[]{4,3};
        int[] right = new int[]{0,1};
        int expectedOutput = 4;
        int actualOutput = LastMomentOfAnt.getLastMoment(n, left, right);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
