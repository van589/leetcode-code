package com.van589.leetcode.offer_0_99.offer54;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 *
 * @author Liang
 */
public class Main {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(2);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        System.out.println(new Solution().kthLargest(node1, 1));

    }
}

class Solution {

    private int ans = 0, count = 0;

    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    private void dfs(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        dfs(root.right, k);
        if (++count == k) {
            ans = root.val;
            return;
        }
        dfs(root.left, k);
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
