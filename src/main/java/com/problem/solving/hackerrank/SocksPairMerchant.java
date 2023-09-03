package com.problem.solving.hackerrank;

import java.util.Collections;
import java.util.List;

public class SocksPairMerchant {
    public static int socksPairMerchant(int totalSocks, List<Integer> socks) {
        System.out.println("Original List : "+socks);
        Collections.sort(socks);
        System.out.println("Sorted List : "+socks);
        int totalSocksPairs = 0;
        int samePairCount = 1;
        for (int i=0; i<socks.size() - 1; i++) {
            if(socks.get(i) == socks.get(i+1)) {
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
