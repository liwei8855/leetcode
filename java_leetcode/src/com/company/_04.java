package com.company;

public class _04 {
    public static void main(String[] args) {
//        int num1[] = {0,0,0,0,0};
//        int num2[] = {-1,0,0,0,0,0,1};
        int num1[] = {1};
        int num2[] = {1};
        double result = findMedianSortedArrays(num1,num2);
        System.out.print(result);
    }

    /*
    * int num1[] = {0,0,0,0,0};
        int num2[] = {-1,0,0,0,0,0,1};没通过
    * */
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length==0&&nums2.length==0) return 0;
        if (nums1.length == 0 || nums2.length == 0){
            int[] array = nums1.length==0?nums2:nums1;
            if (array.length % 2 == 0){
                int mid = array.length / 2;
                return (array[mid] + array[mid-1]) / 2.0;
            } else {
                return array[array.length/2];
            }
        }
        int arrayLength = nums1.length+nums2.length;
        int newsArray[] = new int[arrayLength];
        int i=0;
        int j=0;
        int q=0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i] < nums2[j]) {
                newsArray[q++] = nums1[i++];
            } else if (nums1[i] > nums2[j]){
                newsArray[q++] = nums2[j++];
            } else {
                newsArray[q++] = nums1[i++];
                j++;
            }
        }
        if (i<nums1.length){
           while (i<nums1.length){
               newsArray[q++] = nums1[i++];
           }
        }
        if (j<nums2.length){
            while (j<nums2.length){
                newsArray[q++] = nums2[j++];
            }
        }
        double result = 0;
        if (q % 2 ==0){
            int mid = q / 2;
            result = (newsArray[mid] + newsArray[mid-1]) / 2.0;
        } else {
            result = newsArray[q / 2];
        }
        return result;
    }
}
