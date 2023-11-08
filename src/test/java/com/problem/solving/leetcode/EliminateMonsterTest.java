package com.problem.solving.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EliminateMonsterTest {
    @Test
    public void shouldReturnMaximumEliminatedMonsters() {
        int[] distance = new int[]{1,3,4};
        int[] speed = new int[]{1,1,1};
        int expectedEliminatedMonster = 3;
        int actualEliminatedMonster = EliminateMonster.eliminateMaximum(distance, speed);
        Assertions.assertEquals(expectedEliminatedMonster, actualEliminatedMonster);
    }
}
