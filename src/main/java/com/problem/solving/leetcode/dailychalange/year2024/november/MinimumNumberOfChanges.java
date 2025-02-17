package com.problem.solving.leetcode.dailychalange.year2024.november;

public class MinimumNumberOfChanges {
    private MinimumNumberOfChanges(){}
    public static int minChanges(String s) {
        int ans=0,c=0;
        for(int i=0;i<s.length();i++){
            c+=s.charAt(i)-'0';
            if(i%2==1){
                ans+=(c%2);
                c=0;
            }
        }
        return ans;
    }
}
