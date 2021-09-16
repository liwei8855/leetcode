package com.company.leetcode;

public class _75 {
    public static void main(String[] args) {
        int[] nums = {1};
        sortColors(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"_");
        }
    }
    static void sortColors(int[] nums) {
        if (nums.length<2) return;
        int i=0;
        int j=nums.length-1;
        int k=i;
        while (k<=j){
                if (nums[k]==0){
                    int tmp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = tmp;
                    i++;k=i;
                } else if(nums[k]==2){
                    int tmp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = tmp;
                    j--;
                } else {
                    k++;
                }

        }
    }
//更优
    /*
    * 1:跳过cur++；
    * 0:cur与left交换 left++ cur++
    * 2：cur与right交换 right--，cur不用动再次判断即可
    * */
    static void sortColors1(int[] nums) {
        int i=0;
        int l = 0;
        int r = nums.length-1;
        while (i<=r){
            if (nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[l];
                nums[l] = tmp;
                i++;l++;
            } else if(nums[i]==1){
                i++;
            } else {
                int tmp = nums[i];
                nums[i] = nums[r];
                nums[r] = tmp;
                r--;
            }
        }
    }
}
