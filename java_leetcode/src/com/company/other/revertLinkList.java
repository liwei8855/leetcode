package com.company.other;

import com.company.leetcode.ListNode;

public class revertLinkList {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        ListNode n1 = new ListNode();
        n1.val = 4;
        ListNode n2 = new ListNode();
        n2.val = 3;
        ListNode n3 = new ListNode();
        n3.val = 2;
        ListNode n4 = new ListNode();
        n4.val = 5;

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode.printList(head);
        ListNode node = revert(head);
        ListNode.printList(node);
    }
    static ListNode revert(ListNode head){
        ListNode newHead = new ListNode();
        while (head != null){
            ListNode tmp = head.next;

            head.next = newHead.next;
            newHead.next = head;

            head = tmp;
        }
        return newHead.next;
    }
}
