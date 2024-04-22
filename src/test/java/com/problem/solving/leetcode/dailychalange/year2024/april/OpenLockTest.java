package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OpenLockTest {
    @Test
    public void shouldReturnNumberOfTurnToOpenLock_Success(){
        String[] deadEnds = new String[] {"0201","0101","0102","1212","2002"};
        String target = "0202";
        Assertions.assertEquals(6, OpenLock.openLock(deadEnds, target));
    }
}
