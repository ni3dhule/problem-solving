package com.problem.solving.leetcode.dailychalange.year2024.june;

import java.util.Arrays;

public class MinimumMovesToSeatArrangement {
    private MinimumMovesToSeatArrangement(){}
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}
