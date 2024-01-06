package com.problem.solving.leetcode.dailychalange.year2023.september;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestoreArrayFromAdjacentPairs {
    private RestoreArrayFromAdjacentPairs(){}
    public static int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] pair : adjacentPairs) {
            map.putIfAbsent(pair[0], new ArrayList<>());
            map.putIfAbsent(pair[1], new ArrayList<>());

            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        int[] arr = new int[adjacentPairs.length + 1];
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                arr[0] = entry.getKey();
                arr[1] = entry.getValue().get(0);
                break;
            }
        }
        for (int i=2; i < arr.length; i++) {
            List<Integer> a = map.get(arr[i-1]);
            arr[i] = a.get(0) == arr[i-2] ? a.get(1) : a.get(0);
        }
        return arr;
    }
}
