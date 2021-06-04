package com.example.leet_code;
//颜色分类
public class _75 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    static void sortColors(int[] nums) {
        int begin = 0;
        int end = nums.length-1;
        while (begin<end){
            if (nums[begin]==2){
                int tmp = nums[begin];
                nums[begin] = nums[end];
                nums[end] = tmp;
                end--;
            } else if(nums[end]==0){
                int tmp = nums[begin];
                nums[begin]=nums[end];
                nums[end]=tmp;
                begin++;
            } else {
                begin++;
            }
        }
    }
}
