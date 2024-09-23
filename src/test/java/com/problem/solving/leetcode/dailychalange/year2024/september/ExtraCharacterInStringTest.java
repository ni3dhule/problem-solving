package com.problem.solving.leetcode.dailychalange.year2024.september;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraCharacterInStringTest {
    @Test
    public void shouldReturnExtraCharacterCountSuccess() {
        assertEquals(1, ExtraCharacterInString.minExtraChar("leetscode", new String[]{"leet","code","leetcode"}));
    }
}
