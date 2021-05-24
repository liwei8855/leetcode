package com.example.java_test.链表;

public class 链表反转 {

    //递归
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //非递归
    public ListNode reverseList2(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }

        ListNode newHead = null;
        newHead.next = null;
        while (head.next != null){
            ListNode tempNode = head.next;
            head.next = newHead;
            head = newHead;
            head = tempNode;
        }
        return newHead;
    }

}
