package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LongestSquareStreakTest {
    @Test
    public void shouldReturnLongestSquareStreakSuccess(){
        assertEquals(3, LongestSquareStreak.longestSquareStreak(new int[]{4,3,6,16,8,2}));
    }
}
