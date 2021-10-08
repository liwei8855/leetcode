package com.company.error;

public class _16_16 {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,9};
        int[] arr = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        int[] result = subSort2(arr);
        System.out.println("["+result[0]+","+result[1]+"]");
    }

    static int[] subSort2(int[] array) {
        if (array.length<2) return new int[] {-1,-1};
        int maxIndex=-1;
        int max = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            } else {
                maxIndex = i;
            }
        }

        if (maxIndex == -1) return new int[] {-1,-1};

        int minIndex = -1;
        int min = array[array.length-1];
        for (int i=array.length-1;i>=0;i--){
            if (array[i]<min){
                min = array[i];
            } else {
                minIndex = i;
            }
        }
        return new int[] {minIndex,maxIndex};

    }








    static int[] subSort(int[] array) {

        if (array.length < 2) return new int[] {-1,-1};

        int max = array[0];
        int maxIndex = 0;
        for (int i=1;i<array.length;i++){
            if (array[i] >= max){
                max = array[i];
            } else {
                maxIndex = i;
            }
        }

        int min = array[array.length-1];
        int minIndex = array.length-1;
        for (int j=array.length-2;j>=0;j--){
            if (array[j] <= min){
                min = array[j];
            } else {
                minIndex = j;
            }
        }
        if (maxIndex<minIndex) return new int[] {-1,-1};
        int[] result = {minIndex,maxIndex};
        return result;
    }

    public int[] subSort1(int[] nums) {
        if (nums.length == 0) return new int[] { -1, -1 };

        // 从左扫描到右寻找逆序对（正序：逐渐变大）
        int max = nums[0];
        // 用来记录最右的那个逆序对位置
        int r = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            } else {
                r = i;
            }
        }

        // 提前结束
        if (r == -1) return new int[] { -1, -1 };

        // 从右扫描到左寻找逆序对（正序：逐渐变小）
        int min = nums[nums.length - 1];
        // 用来记录最左的那个逆序对位置
        int l = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= min) {
                min = nums[i];
            } else {
                l = i;
            }
        }

        return new int[] { l, r };
    }
}
