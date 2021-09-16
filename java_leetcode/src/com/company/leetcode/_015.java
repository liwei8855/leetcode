package com.company.leetcode;
import java.util.List;
public class _015 {

    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3) return null;
        int i=0,j=1,q=2;
        while (i<nums.length-2){
            j = i+1;
            while (j<nums.length-1){
                if (nums[i]==nums[j]){
                    j++;
                    continue;
                }
                q = j+1;
                while (q<j){
                    if (nums[i]==nums[q]||nums[j]==nums[q]){
                        j++;
                        continue;
                    }
                    if (nums[i]+nums[j]+nums[q]==0){

                    }
                    q++;
                }
                j++;
            }
            i++;
        }
        return null;
    }
}
