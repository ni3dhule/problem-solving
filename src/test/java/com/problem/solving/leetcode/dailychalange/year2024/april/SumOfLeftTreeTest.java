package com.problem.solving.leetcode.dailychalange.year2024.april;

import com.problem.solving.leetcode.dailychalange.util.TreeNode;
import com.problem.solving.leetcode.dailychalange.util.TreeUtil;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SumOfLeftTreeTest {
    @Test
    public void shouldReturnSumOfLeftNodesOnly_Success(){
        Integer[] treeArray = new Integer[]{3,9,20,null,null,15,7};
        TreeNode root = TreeUtil.constructBinaryTreeFromArray(treeArray);
        Assertions.assertEquals(24, SumOfLeftTree.sumOfLeftLeaves(root));
    }
}
