package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumberOfTeamsTest {
    @Test
    public void shouldReturnTeamCountSuccess() {
        assertEquals(3, CountNumberOfTeams.numTeams(new int[]{2,5,3,4,1}));
    }
}
