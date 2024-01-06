package com.problem.solving.leetcode.dailychalange.year2023.december;

import java.util.List;

public class DestinationCity {
    private DestinationCity(){}
    public static String destCity(List<List<String>> paths) {
        for (List<String> path : paths) {
            String candidate = path.get(1);  // Get the candidate destination city from the current path
            boolean good = true;  // Flag to determine if the candidate is the destination city
            // Check if the candidate city is also a starting city in other paths
            for (List<String> otherPath : paths) {
                if (otherPath.get(0).equals(candidate)) {  // If the candidate is found as a starting city in another path
                    good = false;  // Update flag to indicate it's not the destination city
                    break;  // Exit the loop, as we've found the candidate is not the destination city
                }
            }
            if (good) {
                return candidate;  // If the candidate is not a starting city in any other path, it's the destination city
            }
        }
        return "";
    }
}
