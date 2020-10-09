package com.van589.leetcode.code_100_199.code110;

/**
 * code110 平衡二叉树
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
        node3.left = node4;
        node3.right = node5;

        System.out.println(new Solution().isBalanced(node1));
    }
}

class Solution {

        boolean flag = true;

        public boolean isBalanced(TreeNode root) {
            check(root);
            return flag;
        }

        public int check(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = check(node.left);
            int right = check(node.right);
            if (Math.abs(left - right) > 1) {
                flag = false;
            }
            return Math.max(left, right) + 1;
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
