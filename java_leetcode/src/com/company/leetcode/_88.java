package com.company.leetcode;

import java.lang.reflect.Array;

public class _88 {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge2(nums1,m,nums2,n);
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+"_");
        }
    }

    static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int end = nums1.length-1;
        while (j>=0){
           if (i<0 || nums2[j] >= nums1[i]) {
               nums1[end--] = nums2[j--];
           } else {
               nums1[end--] = nums1[i--];
           }
        }
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0) return;
        if (m==0){
            for (int i=0;i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;
        while (i>=0 && j>=0){
            if (nums2[j] >= nums1[i]){
                nums1[k] = nums2[j];
                k--;j--;
            } else {
                nums1[k] = nums1[i];
                k--;i--;
            }
        }
        while (j>=0){
            nums1[k] = nums2[j];
            k--;j--;
        }
    }
//更优
    static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m-1;
        int i2 = n-1;
        int cur = nums1.length-1;
        while (i2>=0){
            if (i1>=0 && nums2[i2]<nums1[i1]){
                nums1[cur--] = nums1[i1--];
            } else {//i1<0 || nums2[i2]>=nums1[i1]
                nums1[cur--] = nums2[i2--];
            }
        }
    }
}
