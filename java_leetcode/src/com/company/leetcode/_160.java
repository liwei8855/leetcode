package com.company.leetcode;
/*思路：相互补齐判断
* */
public class _160 {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(11);
        ListNode l12 = new ListNode(12);
        ListNode l21 = new ListNode(21);
        ListNode l22 = new ListNode(22);
        ListNode l23 = new ListNode(23);

        ListNode l31 = new ListNode(31);
        ListNode l32 = new ListNode(32);
        ListNode l33 = new ListNode(33);

        l11.next=l12;
        l12.next=l31;
        l31.next=l32;
        l32.next=l33;
        l21.next=l22;
        l22.next=l23;
        l23.next=l31;
        ListNode.printList(l11);
        ListNode.printList(l21);
        ListNode node = getIntersectionNode(l11,l21);
        ListNode.printList(node);
    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null) return null;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB){
            curA = curA != null?curA.next:headB;
            curB = curB != null?curB.next:headA;
        }
        return curA;
    }
}
