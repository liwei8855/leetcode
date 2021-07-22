package com.example.leet_code;


public class _02 {


    public static void main(String[] args) {
        ListNode head1 = new ListNode(2,null);
        ListNode n2 = new ListNode(4,null);
        head1.next = n2;
        ListNode n3 = new ListNode(3,null);
        n2.next = n3;

        printList(head1);

        ListNode head2 = new ListNode(5,null);
        ListNode n4 = new ListNode(6,null);
        head2.next = n4;
        ListNode n5 = new ListNode(4,null);
        n4.next = n5;
        printList(head2);

        ListNode list = addTwoNumbers(head1,head2);
        ListNode.printList(list);
    }


        static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode(0);
        ListNode current = newhead;
        int p = 0;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1.next!=null || l2.next!=null){
            int num1 = l1==null?0:l1.val;
            int num2 = l2==null?0:l2.val;
            int sum = num1+num2;
            if (p==1){
                sum++;
                p=0;
            }
            if (sum >= 10){
                p = 1;
                sum-=10;
            }
            ListNode newNode = new ListNode(sum);
            current.next = newNode;
            current = newNode;
            System.out.println("while");
        }
        return newhead.next;
    }

    public static void printList(ListNode head) {
        if (head==null) return;
        while (head.next != null){
            System.out.print(head.val+"_");
        }
    }
}
