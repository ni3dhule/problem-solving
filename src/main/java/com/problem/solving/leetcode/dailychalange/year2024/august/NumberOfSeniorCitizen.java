package com.problem.solving.leetcode.dailychalange.year2024.august;

public class NumberOfSeniorCitizen {
    private NumberOfSeniorCitizen(){}
    public static int countSeniors(String[] details) {
        int ans = 0;
        for (String x : details) {
            int age = Integer.parseInt(x.substring(11, 13));
            if (age > 60) {
                ++ans;
            }
        }
        return ans;
    }

}
