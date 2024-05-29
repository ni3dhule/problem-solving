package com.problem.solving.leetcode.dailychalange.year2024.may;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReduceBinaryRepresentationTest {
    @Test
    public void shouldReturnNumberOfStepsSuccess(){
        assertEquals(6, ReduceBinaryRepresentation.numSteps("1101"));
    }
}
