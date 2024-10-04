package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DividePlayerEquallyTest {
    @Test
    public void shouldReturnSkillScoreSuccess(){
        assertEquals(22, DividePlayerEqually.dividePlayers(new int[]{3,2,5,1,3,4}));
    }
}
