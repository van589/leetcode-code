package com.van589.leetcode.code_0_99.code24;

/**
 * code24 两两交换链表中的节点
 *
 * @author hasee
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = new Solution().swapPairs(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

class Solution {
    private ListNode pre;
    private ListNode node;

    public ListNode swapPairs(ListNode head) {
        node = node == null ? head : node;
        if (head == null || head.next == null) {
            return node;
        }
        ListNode next = head.next;
        ListNode next2next = head.next.next;

        next.next = head;
        head.next = next2next;
        node = pre == null ? next : node;

        if (pre != null) {
            pre.next = next;
        }
        pre = head;

        return swapPairs(next2next);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}