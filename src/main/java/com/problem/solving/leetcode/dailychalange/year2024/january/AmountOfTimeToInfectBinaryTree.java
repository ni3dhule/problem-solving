package com.problem.solving.leetcode.dailychalange.year2024.january;

import java.util.*;

public class AmountOfTimeToInfectBinaryTree {
    private AmountOfTimeToInfectBinaryTree(){}
    private static Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public static int amountOfTime(TreeNode root, int start) {
        convertToGraph(root);
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        int time = -1;

        while (!queue.isEmpty()) {
            time++;
            for (int i = queue.size(); i > 0; i--) {
                int currentNode = queue.pollFirst();
                visited.add(currentNode);

                if (adjacencyList.containsKey(currentNode)) {
                    for (int neighbor : adjacencyList.get(currentNode)) {
                        if (!visited.contains(neighbor)) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
        }
        return time;
    }

    private static void convertToGraph(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.left.val);
            adjacencyList.computeIfAbsent(node.left.val, k -> new ArrayList<>()).add(node.val);
        }

        if (node.right != null) {
            adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.right.val);
            adjacencyList.computeIfAbsent(node.right.val, k -> new ArrayList<>()).add(node.val);
        }

        convertToGraph(node.left);
        convertToGraph(node.right);
    }
}
