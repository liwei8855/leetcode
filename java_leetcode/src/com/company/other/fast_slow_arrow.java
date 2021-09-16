package com.company.other;

import com.company.leetcode.ListNode;

//快慢指针
//判断是否存在环：设置快慢指针fast和slow，fast步速为2，slow为1，
// 若最终fast==slow，那么就证明单链表中一定有环。
// 如果没有环的话，fast一定先到达尾节点
public class fast_slow_arrow {
    public static void main(String[] args) {
        ListNode head = new ListNode(9,null);
        ListNode n2 = new ListNode(9,null);
        head.next = n2;
        ListNode n3 = new ListNode(9,null);
        n2.next = n3;
        ListNode n4 = new ListNode(9,null);
        n3.next = n4;
        ListNode n5 = new ListNode(9,null);
        n4.next = n5;
        System.out.println(fastSlowArrow(head));
    }
    static boolean fastSlowArrow(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            if (fast == slow){
                return true;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }
}
