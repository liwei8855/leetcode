package com.example.leet_code;

public class _01 {

    public static void main(String[] args) {
        int arr[] = {3,3};
        int result[] = twoSum(arr,6);
        System.out.println(result[0]+"__"+result[1]);
    }

    static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        if (nums.length>1){
            for (int i=0;i<nums.length;i++){
                for (int j=i+1;j<nums.length;j++){
                    if (nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }

//    static int[] twoSum(int[] nums, int target) {
//
//        int i=0;
//        while (i<nums.length){
//
//            int num1 = nums[i];
//            int num2 = target-num1;
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[j] == num2) {
//                    return new int[] {i,j};
//                }
//            }
//
//            i++;
//        }
//
//        return new int[] {-1,-1};
//    }
}
