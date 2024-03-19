package com.problem.solving.leetcode.dailychalange.year2024.march;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskSchedulerTest {
    @Test
    public void shouldReturnMinimumTimeInterval_Success(){
        char[] tasks = new char[]{'A','A','A','B','B','B'};
        int slice = 2;
        int expectedMinInterval =8;
        int actualMinInterval = TaskScheduler.leastInterval(tasks, slice);
        Assertions.assertEquals(expectedMinInterval, actualMinInterval);
    }
}
