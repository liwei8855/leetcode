package com.company.leetcode;
//分隔链表
/*思路：创建两个链表，分别链接 <x的和>=x的 最后串起来
* */
public class _86 {
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
        ListNode n5 = new ListNode();
        n5.val = 2;

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode.printList(head);
        ListNode node = partition(head,3);
        ListNode.printList(node);
    }

    static ListNode partition(ListNode head, int x) {
        if (head==null) return null;
        ListNode lHead = new ListNode();
        ListNode lTail = lHead;
        ListNode rHead = new ListNode();
        ListNode rTail = rHead;
        while (head != null) {
            if (head.val < x){
                lTail.next = head;
                lTail = lTail.next;
            } else {
                rTail.next = head;
                rTail = rTail.next;
            }
            head = head.next;
        }
        lTail.next = rHead.next;
        rTail.next = null;
        return lHead.next;
    }
}
