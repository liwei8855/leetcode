package com.company.leetcode;

import java.util.Arrays;

public class _64 {
    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,3,1}, {1,5,1},{4,2,1}};
        System.out.println(minPathSum(nums));
    }

    static int minPathSum(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] nums = new int[rows][columns];
        nums[0][0] = grid[0][0];
        for (int i=1;i<rows;i++){
            nums[0][i] = nums[0][i-1]+grid[0][i];
        }
        for (int i=1;i<columns;i++){
            nums[i][0] = nums[i-1][0]+grid[i][0];
        }
        for (int i=1;i<rows;i++){
            for (int j=1;j<columns;j++){
                nums[i][j] = Math.min(nums[i-1][j],nums[i][j-1])+grid[i][j];
            }
        }
        for (int i=0;i<rows;i++){
            System.out.println(Arrays.toString(nums[i]));
        }
        return nums[rows-1][columns-1];
    }
}
