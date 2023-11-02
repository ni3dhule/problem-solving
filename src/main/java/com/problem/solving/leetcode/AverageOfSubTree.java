package com.problem.solving.leetcode;

public class AverageOfSubTree {
    private AverageOfSubTree() {
    }
    static int count=0;
    public static int averageOfSubTree(TreeNode root) {
        sol(root);
        return count;
    }
    static class Pair{
        int sum;
        int num;
        Pair(int sum,int num){
            this.sum=sum;
            this.num=num;
        }
    }
    public static Pair sol(TreeNode root){
        if(root==null)return new Pair(0,0);
        Pair left= sol(root.left);
        Pair right=sol(root.right);
        int sum1=root.val+left.sum+right.sum;
        int num1=1+left.num+ right.num;

        if(root.val==sum1/num1)count++;
        return new Pair(sum1,num1);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
