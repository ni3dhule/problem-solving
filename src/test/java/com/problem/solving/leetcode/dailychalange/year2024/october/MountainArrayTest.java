package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MountainArrayTest {
    @Test
    public void shouldReturnMinimumMountainRemovalSuccess(){
        assertEquals(0, MountainArray.minimumMountainRemovals(new int[]{1,3,1}));
    }
}
