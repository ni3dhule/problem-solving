package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DeleteCharToMakeFancyStringTest {
    @Test
    public void shouldReturnFancyMeaningfulStringSuccess(){
        assertEquals("leetcode", DeleteCharToMakeFancyString.makeFancyString("leeetcode"));
    }
}
