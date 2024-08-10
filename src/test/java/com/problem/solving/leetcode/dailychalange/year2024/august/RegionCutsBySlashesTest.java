package com.problem.solving.leetcode.dailychalange.year2024.august;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegionCutsBySlashesTest {
    @Test
    public void shouldReturnRegionCutsCountSuccess() {
        assertEquals(1, RegionCutsBySlashes.regionsBySlashes(new String[]{}));
    }
}
