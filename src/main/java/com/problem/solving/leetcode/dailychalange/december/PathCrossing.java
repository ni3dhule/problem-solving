package com.problem.solving.leetcode.dailychalange.december;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    private PathCrossing(){}
    public static boolean isPathCrossing(String path) {
        Set<String> visitedPoints = new HashSet<>();
        int currentX = 0;
        int currentY = 0;
        visitedPoints.add(currentX + "," + currentY);

        for (char direction : path.toCharArray()) {
            if (direction == 'N') currentY++;
            else if (direction == 'S') currentY--;
            else if (direction == 'E') currentX++;
            else currentX--;

            String point = currentX + "," + currentY;
            if (visitedPoints.contains(point)) {
                return true;
            }

            visitedPoints.add(point);
        }

        return false;
    }
}
