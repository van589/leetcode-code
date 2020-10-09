package com.van589.leetcode.code_600_699.code606;

/**
 * code606 根据二叉树创建字符串
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        System.out.println(new Solution().tree2str(node1));
    }
}

class Solution {

    public String tree2str(TreeNode t) {
        StringBuilder res = new StringBuilder();
        if (t == null) {
            return "";
        }
        res.append(t.val);

        if (t.left == null && t.right == null) {
            return res.toString();
        } else if (t.left != null && t.right == null) {
            return res.append("(").append(tree2str(t.left)).append(")").toString();
        } else if (t.left == null) {
            return res.append("(").append(")").append("(").append(tree2str(t.right)).append(")").toString();
        }

        return res.append("(").append(tree2str(t.left)).append(")").append("(").append(tree2str(t.right)).append(")").toString();
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