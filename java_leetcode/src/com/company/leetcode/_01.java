package com.company.leetcode;

import java.util.HashMap;

public class _01 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] arr1 = twoSum(arr,target);
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"_");
        }
    }

    //hasmap提交效率
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if (map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }

//    static int[] twoSum1(int[] nums, int target) {
//        for (int i=0;i<nums.length;i++){
//            int result = target-nums[i];
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[j]==result){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }
}
