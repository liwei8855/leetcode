package com.company.leetcode;

import static java.lang.Math.abs;
import static java.lang.Math.incrementExact;

public class _977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] result = sortedSquares(arr);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+"_");
        }
    }

    static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int[] result = new int[nums.length];
        int index = nums.length-1;
        while (i<j){
            if (abs(nums[i]) > abs(nums[j])){
                result[index] = nums[i]*nums[i];
                index--;i++;
            } else if(abs(nums[i]) < abs(nums[j])){
                result[index] = nums[j]*nums[j];
                index--;j--;
            }
        }
        return result;
    }

    /*
1 定义左右双指针，结果数组及 index 索引
2通过双指针遍历数组 A
3 对左右两个指针上的元素进行取绝对值的操作（因为有负数的存在，且负数的平方是正数）
4 对取绝对值后的两个正数进行判断
5 若左指针上的元素大于右指针元素，则左指针上的元素的平方存储到结果数组的 index 索引上，且左指针右移一位
6 否则右指针上的元素的平方存储到结果数组的 index 索引上，且右指针左移一位
    */
}
