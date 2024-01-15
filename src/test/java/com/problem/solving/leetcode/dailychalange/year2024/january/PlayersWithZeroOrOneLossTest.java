package com.problem.solving.leetcode.dailychalange.year2024.january;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class PlayersWithZeroOrOneLossTest {
    @Test
    public void shouldReturnListOfNoLostAndAtleaseOneLost_success(){
        int[][] matches = new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<Integer> list1 = Arrays.asList(1,2,10);
        List<Integer> list2 = Arrays.asList(4,5,7,8);
        List<List<Integer>> expectedResult = Arrays.asList(list1, list2);
        List<List<Integer>> actualResult = PlayersWithZeroOrOneLoss.findWinners(matches);
        //Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
