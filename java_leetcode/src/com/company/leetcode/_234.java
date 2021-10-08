package com.company.leetcode;

public class _234 {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 1;
        ListNode n1 = new ListNode();
        n1.val = 2;
        ListNode n2 = new ListNode();
        n2.val = 3;
        ListNode n3 = new ListNode();
        n3.val = 3;
        ListNode n4 = new ListNode();
        n4.val = 1;
//        ListNode n5 = new ListNode();
//        n5.val = 2;

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;
        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(ListNode head) {
        ListNode mid = midNode(head);
        ListNode newHead = revert(mid.next);
        while (newHead != null){
            if (newHead.val != head.val){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

    static ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
