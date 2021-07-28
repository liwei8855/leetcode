package com.company;
import com.company.done.ListNode;

import java.util.List;

public class _0234 {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,null);
        ListNode n2 = new ListNode(2,null);
        head1.next = n2;
        ListNode n3 = new ListNode(2,null);
        n2.next = n3;
        ListNode n4 = new ListNode(1,null);
        n3.next = n4;
//        ListNode n5 = new ListNode(9,null);
//        n4.next = n5;

//        ListNode.printList(head1);
        System.out.println(isPalindrome(head1));
    }
    static boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null) return true;
        if (head.next.next==null) return head.val==head.next.val;

        ListNode middleNode = middleNode(head);

        ListNode newHead = reverseList(middleNode.next);

        while (newHead != null){
            if (newHead.val != head.val){
                return false;
            } else {
                newHead = newHead.next;
                head = head.next;
            }
        }
        return true;
    }

    static ListNode reverseList(ListNode head){
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }

    static ListNode middleNode(ListNode head){
        ListNode mid = head, first = head;
        while (first.next !=null && first.next.next != null){
            first = first.next.next;
            mid = mid.next;
        }
        return mid;
    }
}
