package com.problem.solving.leetcode.dailychalange.year2024.september;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentReplaceChalkTest {
    @Test
    public void shouldReturnStudentReplaceChalkSuccess(){
        assertEquals(0, StudentReplaceChalk.chalkReplacer(new int[]{5,1,5}, 22));
    }
}
