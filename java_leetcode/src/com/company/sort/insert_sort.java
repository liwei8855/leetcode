package com.company.sort;

public class insert_sort {
    public static void main(String[] args) {
//        int list1[] = {16,5,34,74,94,66,85};
//        insertSort(list1);
//        for (int i=0;i<list1.length;i++){
//            System.out.print(list1[i]+"_");
//        }
        String str = "abc add";
        String[] strArr = str.split("\\ ");
        for (int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }

    }

    static void insertSort(int[] array){
        for (int i=1;i<array.length;i++){
            int tmp = array[i];
            int index = -1;
            for (int j=i;j>0;j--){
               if (array[j-1]>tmp){
                   array[j] = array[j-1];
                   index = j-1;
               }
            }
            if (index != -1){
                array[index] = tmp;
            }
        }
    }




    static void insertSort2(int[] arr){
        for (int j=1;j<=arr.length-1;j++){
            int tmp = arr[j];
            int index = -1;
            for (int i=j;i>0;i--){
                if (tmp < arr[i-1]){
                    arr[i] = arr[i-1];
                    index = i-1;
                }
            }
            if (index != -1) {
                arr[index] = tmp;
            }
        }
    }
}


