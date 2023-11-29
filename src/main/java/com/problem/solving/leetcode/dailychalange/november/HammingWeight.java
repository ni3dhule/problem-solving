package com.problem.solving.leetcode.dailychalange.november;

public class HammingWeight {
    private HammingWeight(){}
    public static int hammingWeight(int n) {
        int cnt = 0;
        while(n != 0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }
}
