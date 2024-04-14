package com.problem.solving.leetcode.dailychalange.util;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {
    public static TreeNode constructBinaryTreeFromArray(Integer[] input) {
        if (input == null) {
            return null;
        }
        TreeNode root = new TreeNode(input[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < input.length) {
            TreeNode currentNode = queue.remove();
            if (i < input.length && currentNode !=null) {
                currentNode.left = new TreeNode(input[i++]);
                queue.add(currentNode.left);
            }
            if (i< input.length && currentNode !=null) {
                currentNode.right = new TreeNode(input[i++]);
                queue.add(currentNode.right);
            }
        }
        return root;
    }
}
