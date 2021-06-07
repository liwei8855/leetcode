package com.example.leet_code;
//颜色分类
public class _75 {
    public static void main(String[] args) {
//        int[] arr = {2,0,2,1,1,0};
        int[] arr = {1,0,2};
        sortColors(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    static void sortColors(int[] nums) {
        int begin = 0;
        int end = nums.length-1;
        int index = begin;
        while (index<=end){
            if (nums[index]==2){
                int tmp = nums[end];
                nums[end] = nums[index];
                nums[index] = tmp;
                end--;
            } else if(nums[index]==0){
                int tmp = nums[begin];
                nums[begin]=nums[index];
                nums[index]=tmp;
                begin++;
                index++;
            } else {
                index++;
            }
        }
    }

    static void pList(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"_");
        }
        System.out.println();
    }
}
