package com.company.zuo;

public class _小和 {

    public static void main(String[] args) {
        int array[] = new int[]{1,3,4,2,5};
        int smallSum = mergeSort(array,0,array.length-1);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"_");
        }
        System.out.println();
        System.out.print(smallSum);
    }

    static int mergeSort(int[] array,int L, int R) {
        if (L>=R) return 0;
        int M = L + (R-L)/2;
        int smallSum = mergeSort(array,L,M)+ mergeSort(array,M+1,R)+merge(array,L,M+1,R);
        return smallSum;
    }

    static int merge(int[] array,int L,int M, int R){
        int smallSum = 0;
        int[] temp = new int[R-L+1];
        int l = L;
        int r = M;
        int i = 0;
        while (l<M&&r<=R){
            if (array[l] < array[r]){
                smallSum += array[l]*(R-r+1);;
                temp[i++] = array[l++];
            } else if(array[l]>=array[r]){
                temp[i++] = array[r++];
            }
        }
        while (l<M){
            /*此处不用求小和，因为右边都merge完了，
            右边没有比左边没有merge完的数据再大的值了*/
//            int tmp = array[l]*(R-M+1);
//            smallSum += tmp;
            temp[i++] = array[l++];
        }
        while (r<=R){
            temp[i++] = array[r++];
        }
        for (int j=0;j<temp.length;j++){
            array[L+j] = temp[j];
        }
        return smallSum;
    }
}
