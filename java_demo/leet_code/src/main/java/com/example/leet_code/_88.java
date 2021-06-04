package com.example.leet_code;

public class _88 {
    public static void main(String[] args) {
//         int nums1[] = {1,2,3,0,0,0};
//         int m = 3;
//         int nums2[] = {2,5,6};
//         int n = 3;
        int nums1[] = {0};
        int m = 0;
        int nums2[] = {1};
        int n = 1;
         merge(nums1,m,nums2,n);
         for (int i=0;i<nums1.length;i++){
             System.out.print(nums1[i]);
         }
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int current = nums1.length-1;
        int i = m-1;
        int j = n-1;
        while (j>=0){
            if (i>=0 && nums1[i]>nums2[j]){
                nums1[current] = nums1[i];
                i--;
            } else {
                nums1[current] = nums2[j];
                j--;
            }
            current--;
            pList(nums1);
        }
    }

    static void merge1(int[] nums1, int m, int[] nums2, int n) {//错误

        if (n==0) return;
        int end = nums1.length-1;
        int i = m-1;
        int j = n-1;
        while (j>=0){
            if (nums1[i]<nums2[j]){
                nums1[end] = nums2[j];
                j--;
            } else if(nums1[i]>nums2[j]){
                nums1[end]=nums1[i];
                i--;
            } else {
                nums1[end] = nums2[j];
            }
            end--;
            pList(nums1);
        }
    }

    static void pList(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"_");
        }
        System.out.println();
    }
}
