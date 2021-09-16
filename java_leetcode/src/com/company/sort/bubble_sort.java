package com.company.sort;

public class bubble_sort {

    public static void main(String[] args) {
        int array[] = {16,5,34,66,74,85,94};
        bubbleSort(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"_");
        }
    }

    static void bubbleSort (int[] arr) {
        for (int i=arr.length-1;i>0;i--){
            boolean swaped = false;
            for (int j=1;j<=i;j++){
                if (arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    swaped = true;
                }
            }
            if (swaped==false) break;
        }
    }

    static void bubbleSort1 (int[] arr) {
        for (int i=arr.length-1;i>0;i--){
            for (int j=1;j<=i;j++){
                if (arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
}
