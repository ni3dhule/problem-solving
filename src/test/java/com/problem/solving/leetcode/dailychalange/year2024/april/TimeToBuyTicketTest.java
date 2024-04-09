package com.problem.solving.leetcode.dailychalange.year2024.april;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TimeToBuyTicketTest {
    @Test
    public void shouldReturnTimeTakeToBuyTicket_Success() {
        int[] tickets = new int[]{2,3,2};
        int personPosition = 2;
        Assertions.assertEquals(6,TimeToBuyTicket.timeRequiredToBuy(tickets, personPosition));
    }
}
