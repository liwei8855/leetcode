package com.company.sort;

public class select_sort {
    public static void main(String[] args) {
        int list1[] = {16,5,34,74,94,66,85};
        selectSort(list1);
        for (int i=0;i<list1.length;i++){
            System.out.print(list1[i]+"_");
        }
    }

    static void selectSort(int[] arr){
        for (int i=arr.length-1;i>0;i--){
            int maxIndex = i;
            for (int j=0;j<i;j++){
                if (arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = tmp;
            }
        }
    }
}
