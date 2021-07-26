package com.company;

public class _300 {
    public static void main(String[] args) {
//        int array[] = {10,9,2,5,3,7,101,18};
        int array[] = {7,7,7,7,7,7,7};
        int result = lengthOfLIS(array);
        System.out.print(result);
    }

    static int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = 1;
        int max = dp[0];
        for (int i=1;i<nums.length;i++){
            dp[i] = 1;
            for (int j=0;j<i;j++){
                if (nums[i] <= nums[j]) continue;
                dp[i] = Math.max(dp[j]+1, dp[i]);
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
