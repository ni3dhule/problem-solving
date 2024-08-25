package com.problem.solving.leetcode.dailychalange.year2024.august;

import com.problem.solving.leetcode.dailychalange.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BTPostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        fun(root,result);
        return result;

    }

    private void fun(TreeNode root, List<Integer> result){
        if(root != null){
            fun(root.left,result);
            fun(root.right,result);
            result.add(root.val);
        }
    }
}
