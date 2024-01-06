package com.problem.solving.leetcode.dailychalange.year2023.october;

import java.util.PriorityQueue;

public class EliminateMonster {
    private EliminateMonster(){}
    public static int eliminateMaximum(int[] dist, int[] speed) {
        int wpTime = 0;
        int killCount = 0;
        int sz = dist.length;
        PriorityQueue<Integer> reachTimes = new PriorityQueue<>();
        for(int indx = 0; indx < sz; indx++){

            int timeToReach = (dist[indx] + speed[indx] - 1) / speed[indx];
            reachTimes.offer(timeToReach);
        }
        while(!reachTimes.isEmpty()){
            int currRTime = reachTimes.poll ();
            if(wpTime >= currRTime && killCount > 0){
                return killCount;
            }else{
                killCount++;
            }
            wpTime++;
        }
        return killCount;
    }
}
