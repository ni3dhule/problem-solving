package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.MinimumDifficultyForJobScheduler;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinimumDifficultyForJobSchedulerTest {
    @Test
    public void shouldReturnMinimumDiff_Success(){
        int[] jobDifficult = new int[]{6,5,4,3,2,1};
        int d = 2;
        int expectedResult = 7;
        int actualResult = MinimumDifficultyForJobScheduler.minDifficulty(jobDifficult, d);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
