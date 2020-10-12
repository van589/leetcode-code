package com.van589.leetcode.code_500_599.code530;

/**
 * code530 二叉搜索树的最小绝对差
 *
 * @author hasee
 */
public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2);
        node1.right = node2;
        node2.left = node3;
        System.out.println(new Solution().getMinimumDifference(node1));
    }
}

class Solution {
    private int min = Integer.MAX_VALUE;
    private TreeNode pre;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        getMinimumDifference(root.left);
        if (pre != null) {
            min = Math.min(Math.abs(root.val - pre.val), min);
        }
        pre = root;
        getMinimumDifference(root.right);
        return min;
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