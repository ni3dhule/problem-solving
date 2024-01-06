package com.problem.solving.leetcode.dailychalange.year2023.december;

public class LargestOddNumber {
    private LargestOddNumber(){}
    public static String largestOddNumber(String num) {
        if(num.charAt(num.length()-1)%2==1) return num;
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}
