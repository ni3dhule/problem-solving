package com.problem.solving.leetcode.dailychalange.year2024.july;

public class WaterBottles {
    private WaterBottles(){}
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return totalBottles;
    }
}
