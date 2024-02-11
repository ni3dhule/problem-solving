package com.problem.solving.leetcode.dailychalange.year2024.february;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxCherryPickedUpTest {

    @Test
    public void shouldReturnMaxCheryCollected_Success(){
        int[][] input = new int[][]{{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        int expectedMaxCherries = 24;
        int actualMaxCherries = MaxCherryPickedUp.cherryPickup(input);
        Assertions.assertEquals(expectedMaxCherries, actualMaxCherries);
    }
}
