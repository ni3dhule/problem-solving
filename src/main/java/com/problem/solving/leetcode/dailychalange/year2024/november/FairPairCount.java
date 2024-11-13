package com.problem.solving.leetcode.dailychalange.year2024.november;
import java.util.Arrays;
public class FairPairCount {
    private FairPairCount(){}
    public static long countFairPairs(int[] v, int lower, int upper) {
        Arrays.sort(v);
        long ans = 0;
        for (int i = 0; i < v.length - 1; i++) {
            int low = lowerBound(v, i + 1, v.length, lower - v[i]);
            int up = upperBound(v, i + 1, v.length, upper - v[i]);
            ans += up - low;
        }
        return ans;
    }

    private static int lowerBound(int[] v, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (v[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    private static int upperBound(int[] v, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (v[mid] > target) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}
