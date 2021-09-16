package com.company.leetcode;

public class _01 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 1;
        int[] arr1 = twoSum(arr,target);
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"_");
        }
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            int result = target-nums[i];
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]==result){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
