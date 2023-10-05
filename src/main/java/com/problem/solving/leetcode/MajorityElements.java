package com.problem.solving.leetcode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MajorityElements {
    private MajorityElements(){}
    public static List<Integer> majorityElement(int[] nums) {
        LinkedList<Integer> result = new LinkedList<>();
        Map<Integer, Integer> majorityElements = new LinkedHashMap<>();
        int majorityThreshold = nums.length/3;
        for (int item : nums) {
            if (majorityElements.containsKey(item)){
                majorityElements.put(item, ( majorityElements.get(item)+1));
            } else {
                majorityElements.put(item, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: majorityElements.entrySet()){
            if (entry.getValue()  > majorityThreshold){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
