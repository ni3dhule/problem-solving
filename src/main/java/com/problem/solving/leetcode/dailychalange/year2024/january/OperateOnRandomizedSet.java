package com.problem.solving.leetcode.dailychalange.year2024.january;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class OperateOnRandomizedSet {
    private OperateOnRandomizedSet(){}
    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;
    public boolean search(int val) {
        return map.containsKey(val);
    }
    public boolean insert(int val) {
        if (search(val)) return false;

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    public boolean remove(int val) {
        if (!search(val)) return false;
        int index = map.get(val);
        list.set(index, list.get(list.size() - 1));
        map.put(list.get(index), index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
