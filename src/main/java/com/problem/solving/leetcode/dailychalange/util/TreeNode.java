package com.problem.solving.leetcode.dailychalange.util;
public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {
    }

    public TreeNode(Integer val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
