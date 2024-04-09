package com.problem.solving.leetcode.dailychalange.year2024.april;

import java.util.LinkedList;
import java.util.Queue;

public class TimeToBuyTicket {
    private TimeToBuyTicket(){}
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;
        for(int i=0; i<tickets.length; i++) {
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            int index = queue.poll();
            tickets[index]--;
            time++;

            if(tickets[index]==0 && index==k) {
                return time;
            }
            if(tickets[index] > 0) {
                queue.add(index);
            }
        }
        return time;
    }
}
