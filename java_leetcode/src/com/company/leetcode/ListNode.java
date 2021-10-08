package com.company.leetcode;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
        this.val = 0;
        this.next = null;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printList(ListNode head){
        while (head!=null){
            System.out.print(head.val+"_");
            head = head.next;
        }
        System.out.println("null");
    }
}
