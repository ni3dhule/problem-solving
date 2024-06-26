package com.problem.solving.leetcode.dailychalange.year2024.may;

public class CompareVersionNumber {
    private CompareVersionNumber(){}
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i=0, j=0;

        while(i<v1.length || j<v2.length) {
            int a=0,b=0;
            if(i<v1.length)
            {
                a=Integer.parseInt(v1[i]);
            }
            if(j<v2.length)
            {
                b=Integer.parseInt(v2[j]);
            }

            if(a<b) return -1;
            else if(a>b) return 1;

            i++;
            j++;
        }
        return 0;
    }
}
