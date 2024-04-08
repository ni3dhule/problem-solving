package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentUnableToEatLunchTest {
    @Test
    public void shouldReturnCountOfStudentUnableToLunch_Success() {
        int[] student = new int[]{1,1,0,0};
        int[] lunch = new int[]{0,1,0,1};
        Assertions.assertEquals(0, StudentUnableToEatLunch.countStudents(student, lunch));
    }
}
