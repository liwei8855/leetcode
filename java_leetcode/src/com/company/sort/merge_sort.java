package com.company.sort;

import java.lang.reflect.Array;

public class merge_sort {
    public static void main(String[] args) {
        int list[] = {16,5,34,74,94,66,85};
        mergeSort(list,0,list.length-1);
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"_");
        }
    }

    static void mergeSort(int[] array,int left,int right) {
        if (left>=right) return;
        int mid = left + (right-left)/2;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,mid+1,right);
    }
    static void merge(int[] array,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i = 0;
        int l = left;
        int r = mid;
        while (l<mid&&r<=right){
            if (array[l]<array[r]) {
                temp[i++] = array[l++];
            } else if (array[l]>array[r]){
                temp[i++] = array[r++];
            } else {
                temp[i++] = array[l++];
                r++;
            }
        }
        while (l<mid) {
            temp[i++] = array[l++];
        }
        while (r<=right) {
            temp[i++] = array[r++];
        }
        for (int j=0;j<temp.length;j++){
            array[left+j] = temp[j];
        }
    }
}
