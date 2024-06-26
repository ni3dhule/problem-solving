package com.problem.solving.leetcode.dailychalange.year2024.june;

import com.problem.solving.leetcode.dailychalange.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTree {
    private BalancedBinaryTree(){}
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedElements = new ArrayList<>();
        inOrderTraversal(root, sortedElements);
        return buildBalancedBST(sortedElements, 0, sortedElements.size() - 1);
    }

    private void inOrderTraversal(TreeNode node, List<Integer> sortedElements) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, sortedElements);
        sortedElements.add(node.val);
        inOrderTraversal(node.right, sortedElements);
    }

    private TreeNode buildBalancedBST(List<Integer> elements, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(elements.get(mid));
        node.left = buildBalancedBST(elements, start, mid - 1);
        node.right = buildBalancedBST(elements, mid + 1, end);
        return node;
    }
}
