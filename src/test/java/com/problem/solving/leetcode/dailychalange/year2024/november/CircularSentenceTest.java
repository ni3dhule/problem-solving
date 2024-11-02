package com.problem.solving.leetcode.dailychalange.year2024.november;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircularSentenceTest {
    @Test
    public void shouldReturnTrueForCircularSentenceSuccess(){
        assertTrue(CircularSentence.isCircularSentence("leetcode exercises sound delightful"));
    }
}
