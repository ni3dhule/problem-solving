package com.problem.solving.leetcode.dailychalange.year2023.october;

public class MonotonicArray {
    private MonotonicArray(){}
    public static boolean isMonotonic(int[] inputs) {
        // Runtime 1 ms
        if(inputs.length == 1)
            return true;
        int firstElement = inputs[0];
        int lastElement = inputs[inputs.length-1];
        boolean isAscending = false;
        if(firstElement < lastElement)
            isAscending = true;
        boolean monotonic = true;
        for (int i = 0; i < inputs.length-1; i++){
            if(isAscending && inputs[i] <= inputs[i+1]){
                continue;
            } else if (isAscending && inputs[i] > inputs[i+1]) {
                monotonic=false;
                break;
            } else if(!isAscending && inputs[i] >= inputs[i+1]) {
                continue;
            } else if(!isAscending && inputs[i] < inputs[i+1]) {
                monotonic=false;
                break;
            }
        }
        return monotonic;
    }
}
