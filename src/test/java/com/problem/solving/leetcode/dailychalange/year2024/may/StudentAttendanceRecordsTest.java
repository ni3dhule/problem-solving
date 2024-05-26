package com.problem.solving.leetcode.dailychalange.year2024.may;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentAttendanceRecordsTest {
    @Test
    public void shouldReturnStudentRecordsSuccess(){
        assertEquals(8, StudentAttendanceRecords.checkRecord(2));
    }
}
