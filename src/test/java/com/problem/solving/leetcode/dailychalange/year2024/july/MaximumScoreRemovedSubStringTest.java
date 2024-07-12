package com.problem.solving.leetcode.dailychalange.year2024.july;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumScoreRemovedSubStringTest {
    @Test
    public void shouldReturnMaxScoreToRemoveSubStringSuccess(){
        assertEquals(19, MaximumScoreRemovedSubString.maximumGain("cdbcbbaaabab", 4,5));
    }
}
