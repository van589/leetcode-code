package com.van589.leetcode.code_500_599.code589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * code589 N叉树的前序遍历
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(6);
        Node node5 = new Node(2);
        Node node6 = new Node(4);

        List<Node> list1 = new ArrayList<>();
        list1.add(node2);
        list1.add(node5);
        list1.add(node6);

        List<Node> list2 = new ArrayList<>();
        list2.add(node3);
        list2.add(node4);
        node1.children = list1;
        node2.children = list2;
        System.out.println(new Solution().preorder(node1));
    }
}

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> nodes = new Stack<>();
        if (root == null) {
            return result;
        }
        nodes.push(root);
        while (!nodes.isEmpty()) {
            Node node = nodes.pop();
            result.add(node.val);
            if (node.children != null) {
                List<Node> children = node.children;
                for (int i = children.size() - 1; i >= 0; i--) {
                    nodes.push(children.get(i));
                }
            }
        }
        return result;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
