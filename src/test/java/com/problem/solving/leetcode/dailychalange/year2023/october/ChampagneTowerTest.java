package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.ChampagneTower;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ChampagneTowerTest {
    @Test
    public void getChampagneTowerTest1() {
        int poured = 1;
        int row = 1;
        int glass = 1;
        double actualResult = ChampagneTower.champagneTower(poured, row, glass);
        double expectedResult = 0.00000;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
