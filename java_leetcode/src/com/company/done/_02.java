package com.company.done;

public class _02 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(9,null);
        ListNode n2 = new ListNode(9,null);
        head1.next = n2;
        ListNode n3 = new ListNode(9,null);
        n2.next = n3;
        ListNode n4 = new ListNode(9,null);
        n3.next = n4;
        ListNode n5 = new ListNode(9,null);
        n4.next = n5;

        ListNode.printList(head1);

        ListNode head2 = new ListNode(9,null);
        ListNode n11 = new ListNode(9,null);
        head2.next = n11;
        ListNode n12 = new ListNode(9,null);
        n11.next = n12;
        ListNode.printList(head2);

        ListNode list = addTwoNumbers(head1,head2);
        ListNode.printList(list);
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0,null);
        ListNode current = dummyHead;
        int flag = 0;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1 !=null || l2 !=null){
            int num1 = l1==null?0:l1.val;
            int num2 = l2==null?0:l2.val;
            int sum = num1+num2+flag;
            flag = sum / 10;
            current.next = new ListNode(sum % 10,null);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (flag == 1){
            ListNode newNode = new ListNode(flag,null);
            current.next = newNode;
        }
        return dummyHead.next;
    }

}
