package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.MajorityElements;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsTest {
    @Test
    public void getMajorityElementsPositiveTestCase(){
        int[] arr = new int[]{3,2,3};
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        List<Integer> actualResult = MajorityElements.majorityElement(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
