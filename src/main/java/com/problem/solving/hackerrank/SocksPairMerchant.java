package com.problem.solving.hackerrank;

import java.util.Collections;
import java.util.List;

public class SocksPairMerchant {
    private SocksPairMerchant(){}
    public static int socksPairMerchant(int totalSocks, List<Integer> socks) {
        Collections.sort(socks);
        int totalSocksPairs = 0;
        int samePairCount = 1;
        for (int i=0; i < totalSocks - 1; i++) {
            if(socks.get(i).equals(socks.get(i+1))) {
                samePairCount++;
            } else {
                totalSocksPairs+= samePairCount/2;
                samePairCount = 1;
            }
        }
        totalSocksPairs+=samePairCount/2;
        return totalSocksPairs;
    }
}
