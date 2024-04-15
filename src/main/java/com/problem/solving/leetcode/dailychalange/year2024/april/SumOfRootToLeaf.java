package com.problem.solving.leetcode.dailychalange.year2024.april;

public class SumOfRootToLeaf {
    private SumOfRootToLeaf() {
    }

    public static int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    private static int ans = 0;

    private static void dfs(TreeNode root, int path) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ans += path * 10 + root.val;
            return;
        }
        dfs(root.left, path * 10 + root.val);
        dfs(root.right, path * 10 + root.val);
    }
}
