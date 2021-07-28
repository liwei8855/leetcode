package com.company.done;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
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
