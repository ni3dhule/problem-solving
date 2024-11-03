package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class RotateStringTest {
    @Test
    public void shouldReturnTrueMeetGoalStringAfterRotateSuccess() {
        assertTrue(RotateString.rotateString("abcde", "cdeab"));
    }
}
