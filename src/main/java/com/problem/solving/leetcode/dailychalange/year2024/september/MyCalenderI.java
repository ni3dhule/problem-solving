package com.problem.solving.leetcode.dailychalange.year2024.september;

import java.util.TreeMap;

public class MyCalenderI {
    TreeMap<Integer, Integer> calcy;
    public MyCalenderI() {
        calcy = new TreeMap();
    }

    public boolean book(int start, int end) {
        Integer prevBook = calcy.floorKey(start);
        Integer nextBook = calcy.ceilingKey(start);
        if((prevBook==null || calcy.get(prevBook)<=start) && (nextBook==null || end<=nextBook))
        {
            calcy.put(start, end);
            return true;
        }
        return false;
    }
}
