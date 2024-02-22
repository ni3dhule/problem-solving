package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindTownJudgeTest {
    @Test
    public void shouldReturnTownJudgeCount_Success(){
        int n = 2;
        int[][] trustInput = new int[][]{{1,2}};
        int expectedTownJudgeCount = 2;
        int actualTownJudgeCount = FindTownJudge.findJudge(n, trustInput);
        Assertions.assertEquals(expectedTownJudgeCount, actualTownJudgeCount);
    }
}
