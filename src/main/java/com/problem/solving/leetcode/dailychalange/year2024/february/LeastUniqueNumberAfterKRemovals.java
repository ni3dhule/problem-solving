package com.problem.solving.leetcode.dailychalange.year2024.february;

import java.util.*;

public class LeastUniqueNumberAfterKRemovals {
    private LeastUniqueNumberAfterKRemovals(){}
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int a : arr) mp.put(a, mp.getOrDefault(a, 0) + 1);

        List<Integer> v = new ArrayList<>(mp.values());
        int cnt = 0;

        Collections.sort(v);
        for (int i = 0; i < v.size(); i++) {
            if (k > v.get(i)) {
                k -= v.get(i);
                v.set(i, 0);
            } else {
                v.set(i, v.get(i) - k);
                k = 0;
            }
            if (v.get(i) != 0) cnt++;
        }
        return cnt;
    }
}
