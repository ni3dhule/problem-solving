package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideIntervalsToMinimumGroupsTest {
    @Test
    public void shouldReturnMinimumNumberOfGroupsSuccess(){
        assertEquals(3, DivideIntervalsToMinimumGroups.minGroups(new int[][]{{5,10},{6,8},{1,5},{2,3},{1,10}}));
    }
}
