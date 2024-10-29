package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MaxMovesTest {
    @Test
    public void shouldReturnMaxMovesSuccess() {
        assertEquals(3, MaxMoves.maxMoves(new int[][]{{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}}));
    }
}
