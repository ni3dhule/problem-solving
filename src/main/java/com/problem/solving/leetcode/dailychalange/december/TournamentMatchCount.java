package com.problem.solving.leetcode.dailychalange.december;

public class TournamentMatchCount {
    private TournamentMatchCount(){}
    public static int numberOfMatches(int n) {
        int count = 0;
        int rev = 0;
        while(n>1) {
            rev = n/2;
            count+=rev;
            n=n-rev;
        }
        return count;
    }
}
