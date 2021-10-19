package com.company.offer2;

import java.util.Arrays;

//礼物的最大价值
public class _47 {
    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,3,1}, {1,5,1},{4,2,1}};
        System.out.println(maxValue(nums));
    }

    static int maxValue(int[][] grid) {
        int value = 0;
        int row = grid.length;
        int column = grid[0].length;
        int[][] nums = new int[row][column];
        nums[0][0] = grid[0][0];
        for (int i=1;i<column;i++){
            nums[0][i] = nums[0][i-1]+grid[0][i];
        }
        for (int i=1;i<row;i++){
            nums[i][0] = nums[i-1][0]+grid[i][0];
        }
        for (int i=1;i<row;i++){
            for (int j=1;j<column;j++) {
                nums[i][j] = Math.max(nums[i-1][j],nums[i][j-1])+grid[i][j];
            }
        }
        for (int i=0;i<row;i++){
            System.out.println(Arrays.toString(nums[i]));
        }
        return nums[row-1][column-1];
    }
}
