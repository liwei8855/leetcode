package com.company.leetcode;

public class _203 {

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        ListNode n1 = new ListNode();
        n1.val = 2;
        ListNode n2 = new ListNode();
        n2.val = 6;
        ListNode n3 = new ListNode();
        n3.val = 3;
        ListNode n4 = new ListNode();
        n4.val = 4;
        ListNode n5 = new ListNode();
        n5.val = 5;
        ListNode n6 = new ListNode();
        n6.val = 6;

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        ListNode.printList(head);
        ListNode n = removeElements(head,6);
        ListNode.printList(n);
    }

    static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        while (head != null){
            if (head.val != val){
                cur.next = head;
                cur = head;
            }
            head = head.next;
        }
        cur.next = null;
        return newHead.next;
    }
}
