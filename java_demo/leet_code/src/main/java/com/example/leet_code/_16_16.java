package com.example.leet_code;
//将数组区间 [m,n]排好序数组就有序了，找出最短序列 没有返回[-1,-1]
public class _16_16 {

    public static void main(String[] args) {
        int list1[] = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        int[] result = search(list1);
    }

    static int[] search(int[] arr){
        int notFound[] = {-1,-1};
        if (arr == null || arr.length==0) return notFound;

        int endPosition = 0;
        int max = arr[0];
        int begin = 1;
        while (begin < arr.length) {
            if (arr[begin]>max){
                max = arr[begin++];
            } else {
                endPosition = begin++;
            }
        }
        int end = arr.length-1;
        int beginPosition = 0;
        int min = arr[end];
        while (end>=0){
            if (arr[end]<min){
                min = arr[end--];
            } else {
                beginPosition = end--;
            }
        }

        int result[] = {beginPosition,endPosition};
        System.out.print("["+beginPosition+",");
        System.out.print(endPosition+"]");
        return result;
    }
}
