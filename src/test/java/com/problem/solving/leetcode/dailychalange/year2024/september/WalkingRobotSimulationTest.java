package com.problem.solving.leetcode.dailychalange.year2024.september;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalkingRobotSimulationTest {
    @Test
    public void shouldReturnWalkingRobotSuccess() {
        assertEquals(25, WalkingRobotSimulation.robotSim(new int[]{4, -1, 3}, new int[][]{}));
    }
}
