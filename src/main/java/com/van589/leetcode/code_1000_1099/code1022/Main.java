package com.van589.leetcode.code_1000_1099.code1022;

/**
 * code1022 从根到叶的二进制数之和
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        System.out.println(new Solution().sumRootToLeaf(node1));
    }
}

class Solution {
    private int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum % 1000000007;
    }

    private void dfs(TreeNode root, int count) {
        if (root == null) {
            return;
        }
        int val = (count << 1) + root.val ;
        if (root.left == null && root.right == null) {
            sum += val % 1000000007;

        }
        dfs(root.left, val);
        dfs(root.right, val);
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
