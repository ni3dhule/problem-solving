package com.problem.solving.leetcode;

/**
 * @author niteen.dhule
 * @since 2023 Sept 24
 * Problem Statement : We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, and so on until the 100th row.
 * Each glass holds one cup of champagne.
 * Then, some champagne is poured into the first glass at the top.
 * When the topmost glass is full, any excess liquid poured will fall equally to the glass immediately to the left and right of it.
 * When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on.
 * (A glass at the bottom row has its excess champagne fall on the floor.)
 * For example, after one cup of champagne is poured, the top most glass is full.
 * After two cups of champagne are poured, the two glasses on the second row are half full.
 * After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now.
 * After four cups of champagne are poured, the third row has the middle glass half full, and the two outside glasses are a quarter full,
 */
public class ChampagneTower {

    private ChampagneTower() {}
    public static double champagneTower(int poured, int queryRow, int queryGlass) {
        double[][] glassTower = new double[queryRow + 1][queryRow + 1];
        glassTower[0][0] = poured;
        for (int r = 0; r < queryRow; r++) {
            for (int g = 0; g < r; g++) {
                double extra = (glassTower[r][g] - 1.0) / 2.0;
                if (extra > 0) {
                    glassTower[r + 1][g] += extra;
                    glassTower[r + 1][g + 1] += extra;
                }
            }
        }
        return Math.min(1.0, glassTower[queryRow][queryGlass]);
    }
}
