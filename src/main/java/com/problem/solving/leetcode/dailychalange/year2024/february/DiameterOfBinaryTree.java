package com.problem.solving.leetcode.dailychalange.year2024.february;

public class DiameterOfBinaryTree {
    private DiameterOfBinaryTree(){}
    public static int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return maxDia;
    }
    private static int maxDia = 0;
    private static int findDiameter(TreeNode root){
        if(root == null)return 0;
        int leftDepth = findDiameter(root.left);
        int rightDepth = findDiameter(root.right);
        int currDia = leftDepth + rightDepth;
        maxDia = Math.max(maxDia, currDia);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
