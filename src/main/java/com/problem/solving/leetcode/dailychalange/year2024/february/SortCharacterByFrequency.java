package com.problem.solving.leetcode.dailychalange.year2024.february;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    private SortCharacterByFrequency(){}
    public static String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );

        pq.addAll(hm.entrySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            //result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
            result.append(String.valueOf(entry.getKey())).append(entry.getValue());
        }

        return result.toString();
    }
}
