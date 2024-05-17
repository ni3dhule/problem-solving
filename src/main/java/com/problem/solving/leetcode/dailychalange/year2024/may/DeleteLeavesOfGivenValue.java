package com.problem.solving.leetcode.dailychalange.year2024.may;

import com.problem.solving.leetcode.dailychalange.util.TreeNode;

public class DeleteLeavesOfGivenValue {
    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && root.val == target)
            return null;
        return root;
    }
}
