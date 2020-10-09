package com.van589.leetcode.code_800_899.code897;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * code897 递增顺序查找树
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
        TreeNode treeNode = new Solution().increasingBST(node1);
        /*while (treeNode != null) {
            System.out.println(treeNode.val);
            treeNode = treeNode.right;
        }*/
    }
}

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                queue.add(root);
                root = root.right;
            }
        }
        TreeNode head = queue.peek();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            node.left = null;
            node.right = queue.peek();
        }
        return head;
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