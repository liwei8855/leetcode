package com.company.leetcode;


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

        ListNode list = addTwoNumbers2(head1,head2);
        ListNode.printList(list);
    }

    static ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        int flag = 0;
        while (l1 != null && l2 != null){
            int result = l1.val+l2.val+flag;
            flag = result / 10;
            int sum = result % 10;
            cur.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        ListNode restNode = l1==null?l2:l1;
        while (restNode != null){
            int result = restNode.val+flag;
            flag = result / 10;
            int sum = result % 10;
            cur.next = new ListNode(sum);
            restNode = restNode.next;
            cur = cur.next;
        }
        if (flag>0){
            cur.next = new ListNode(flag);
        }
        return newHead.next;
    }

    static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;

        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode newHead = new ListNode();
        ListNode curren = newHead;
        int flag = 0;
        while (list1 != null && list2 != null){
            int result = list1.val + list2.val+flag;
            flag = result/10;
            result = result%10;
            curren.next = new ListNode(result);
            curren = curren.next;
            list1 = list1.next;
            list2 = list2.next;
        }
        if (list1 != null || list2 != null){
            ListNode list = list1 != null?list1:list2;
            while (list != null){
                int result = list.val + flag;
                flag = result / 10;
                result = result % 10;
                curren.next = new ListNode(result);
                curren = curren.next;
                list = list.next;
            }
        }
        if (flag > 0){
            curren.next = new ListNode(flag);
        }
        return newHead.next;
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
