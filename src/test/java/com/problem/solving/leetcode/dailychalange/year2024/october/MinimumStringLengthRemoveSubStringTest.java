package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumStringLengthRemoveSubStringTest {
    @Test
    public void shouldReturnMinimumLengthAfterRemoveSubStringSuccess(){
        assertEquals(2, MinimumStringLengthRemoveSubString.minStringLength("ABFCACDB"));
    }
}
