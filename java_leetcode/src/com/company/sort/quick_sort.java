package com.company.sort;

public class quick_sort {
    public static void main(String[] args) {
        int list[] = {16,5,34,66,74,94,85};
        quickSort(list);
//        System.out.println(pivotIndex(list,0,list.length-1));
//        for (int i=0;i<list.length;i++){
//            System.out.print(list[i]+"_");
//        }
    }

    static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    static void quickSort(int[] arr,int begin,int end){
        System.out.print(begin+"_"+end+":");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"_");
        }
        System.out.println();
        if (end-begin<1) return;
        int pivot = pivotIndex(arr,begin,end);
        quickSort(arr,begin,pivot);
        quickSort(arr,pivot+1,end);
    }
    static int pivotIndex(int[] arr, int begin, int end){
        int value = arr[begin];
        int i=begin;
        int j=end;
        while (i<j){
           while (i<j){
               if (arr[j]>value){
                   j--;
               } else {
                   arr[i++] = arr[j];
               }
           }
           while (i<j){
               if (arr[i]<value){
                   i++;
               } else {
                   arr[j--] = arr[i];
               }
           }
        }
        arr[i] = value;
        return i;
    }
}
