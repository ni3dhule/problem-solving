package com.problem.solving.leetcode.dailychalange.year2023.november;

public class MaxCoinCollected {
    private MaxCoinCollected(){}
    public static int maxCoins(int[] piles) {
        int n=piles.length;
        int m=0;
        int [] freq=new int[10001];
        for (int x : piles){
            freq[x]++;
            m=Math.max(m, x);
        }
        int ans=0;
        int count=0;
        int x=0;
        int  alice=0;
        int k=n/3;
        for(x=m; count<k; x--){
            if (freq[x]>0){
                int f=freq[x]+alice;
                int f0=f>>1;
                count+=f0;
                ans+=f0*x;
                alice=(f%2==1)?1:0;
            }
        }
        ans-=(count-k)*(x+1);//if count>n/3 subtract some piles
        return ans;
    }
}
