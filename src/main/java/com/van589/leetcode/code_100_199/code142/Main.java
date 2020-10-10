package com.van589.leetcode.code_100_199.code142;

import java.util.HashSet;
import java.util.Set;

/**
 * code142 环形链表 II
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(new Solution().detectCycle(new ListNode(1)).val);
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<ListNode> nodeSet = new HashSet<>();
        nodeSet.add(head);
        while (nodeSet.contains(head)) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
            if (!nodeSet.add(head)) {
                break;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}