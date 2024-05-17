package com.problem.solving.leetcode.dailychalange.year2024.may;

import com.problem.solving.leetcode.dailychalange.year2024.april.TreeNode;

public class DistributeCoins {
    private int moves = 0;

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left_excess = dfs(node.getLeft());
        int right_excess = dfs(node.getRight());
        moves += Math.abs(left_excess) + Math.abs(right_excess);
        return node.getVal() + left_excess + right_excess - 1;
    }

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
}
