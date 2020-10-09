package com.van589.leetcode.offer_0_99.offer55;

import java.util.Stack;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.right = node4;
        node3.right = node5;

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(4);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode4.left = treeNode6;
        treeNode4.right = treeNode7;

        System.out.println(new Solution().isBalanced(treeNode1));
    }
}

class Solution {

    public boolean isBalanced(TreeNode root) {
        int dfs = dfs(root);
        return dfs >= 0;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left >= 0 && right >= 0 && Math.abs(left - right) <= 1) {
            return Math.max(left, right) + 1;
        }
        return -1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}