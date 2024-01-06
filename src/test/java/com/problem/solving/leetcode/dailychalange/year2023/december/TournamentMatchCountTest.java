package com.problem.solving.leetcode.dailychalange.year2023.december;

import com.problem.solving.leetcode.dailychalange.december.TournamentMatchCount;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TournamentMatchCountTest {
    @Test
    public void shouldReturnTotalMatchCountInTournament_Success(){
        int totalTeams = 7;
        int expectedMatchCount = 6;
        int actualMatchCount = TournamentMatchCount.numberOfMatches(totalTeams);
        Assertions.assertEquals(expectedMatchCount, actualMatchCount);
    }
}
