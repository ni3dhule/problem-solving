package com.problem.solving.leetcode.dailychalange.year2023.december;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DestinationCityTest {
    @Test
    public void shouldReturnDestinationCity_Success()  {
        List<List<String>> input = new ArrayList<>();
        List<String> path1 = Arrays.asList("London","New York");
        List<String> path2 = Arrays.asList("New York","Lima");
        List<String> path3 = Arrays.asList("Lima","Sao Paulo");
        input.add(path1);
        input.add(path2);
        input.add(path3);
        String expectedDestination = "Sao Paulo";
        String actualDestination = DestinationCity.destCity(input);
        Assertions.assertEquals(expectedDestination, actualDestination);
    }
}
