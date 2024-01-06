package com.problem.solving.leetcode.dailychalange.year2023.october;

public class KthSymbolGrammer {
    private KthSymbolGrammer(){}
    public static int kthGrammar(int n, int k) {
        int s=1<<(n-1);
        int x=0;
        int sum=0;
        while(s>1)
        {
            s=s/2;
            if((sum+s)<k){
                x=x==0?1:0;
                sum+=s;
            }

        }
        return x;
    }
}
