package com.problem.solving.leetcode.dailychalange.year2023.october;

public class ABMoveGameWinner {
    private ABMoveGameWinner(){}
    public static boolean winnerOfGame(String colors) {
        return colors.replaceAll("A{3,}", "AA").length() < colors.replaceAll("B{3,}", "BB").length();
    }
}
