package com.company.leetcode;

import java.sql.PreparedStatement;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
//滑动窗口最大值
public class _239 {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,-1,-3,5,3,6,7};
        for (int i=0;i<array.length;i++){
            System.out.print(Integer.toString(array[i])+'_');
        }
        System.out.println();
        int[] r = maxSlidingWindow(array,3);
        for (int i=0;i<r.length;i++){
            System.out.print(Integer.toString(r[i])+'_');
        }
    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length==0 || k<1) return new int[0];
        if (k==1) return nums;
        int[] result = new int[nums.length-k+1];

        Deque<Integer> deque = new LinkedList();
        for (int i=0;i<nums.length;i++){
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                deque.pollLast();//删除
            }
            deque.offerLast(i);//添加队尾
            int w = i-k+1;
            if (w>=0){
                if (deque.peekFirst()<w){
                    deque.pollFirst();
                }
                result[w] = nums[deque.peekFirst()];//peek取值
            }
        }
        return result;
    }
}
