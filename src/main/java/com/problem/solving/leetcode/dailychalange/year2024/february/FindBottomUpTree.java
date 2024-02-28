package com.problem.solving.leetcode.dailychalange.year2024.february;

public class FindBottomUpTree {
    private FindBottomUpTree(){}
    private int maxDepth;
    private int bottomLeft;

    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        bottomLeft = 0;
        dfs(root, 0);
        return bottomLeft;
    }

    private void dfs(TreeNode curr, int depth) {
        if (curr == null) {
            return;
        }
        if (depth > maxDepth) {
            maxDepth = depth;
            bottomLeft = curr.val;
        }
        dfs(curr.left, depth + 1);
        dfs(curr.right, depth + 1);
    }
}
