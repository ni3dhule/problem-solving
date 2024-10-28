package com.problem.solving.leetcode.dailychalange.year2024.october;

import com.problem.solving.leetcode.dailychalange.util.TreeNode;

public class FlipEquivalentBinaryTree {
    private FlipEquivalentBinaryTree(){}
    public static boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return checker(root1, root2);
    }

    private static boolean checker(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;

        }
        return (checker(node1.left, node2.left) || checker(node1.left, node2.right)) &&
                (checker(node1.right, node2.right) || checker(node1.right, node2.left));
    }
}