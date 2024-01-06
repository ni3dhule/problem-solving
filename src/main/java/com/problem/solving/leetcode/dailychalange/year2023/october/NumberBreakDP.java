package com.problem.solving.leetcode.dailychalange.year2023.october;

public class NumberBreakDP {
    private NumberBreakDP(){}
    public static int integerBreak(int n) {
        if(n<4)
            return n-1;
        int numOfThrees = n/3;
        long prodOfThree = (long) Math.pow(3, numOfThrees);
        if(n%3 == 1) {
            prodOfThree /= 3;
            prodOfThree *=4;
        }else if(n%3 == 2){
            prodOfThree *=2;
        }
        return (int)prodOfThree;
    }
}
