package com.problem.solving.leetcode.dailychalange.year2024.january;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSingleArrayTo2DArray {
    private ConvertSingleArrayTo2DArray(){}
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        while (!numList.isEmpty()) {
            List<Integer> uniqueRow = new ArrayList<>();
            for (int i = 0; i < numList.size(); i++) {
                if (!s.contains(numList.get(i))) {
                    s.add(numList.get(i));
                    uniqueRow.add(numList.get(i));
                    numList.remove(i);
                    i--;
                }
            }
            ans.add(uniqueRow);
            s.clear();
        }
        return ans;
    }
}
