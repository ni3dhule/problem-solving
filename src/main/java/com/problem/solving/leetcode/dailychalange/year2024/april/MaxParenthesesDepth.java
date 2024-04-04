package com.problem.solving.leetcode.dailychalange.year2024.april;

public class MaxParenthesesDepth {
    private MaxParenthesesDepth(){}
    public static int maxDepth(String s) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            max=Math.max(count,max);
            if(s.charAt(i)==')') count--;
        }
        return max;
    }
}
