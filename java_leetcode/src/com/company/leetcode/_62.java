package com.company.leetcode;

import java.util.Arrays;
/*
* 思路：[0][i],[i][0]位置都只有一条路 值为1
*       中间部分，到达每一个位置的路的条数为
*       上边位置可到达的路与左边位置可到达路的数量和
* */
public class _62 {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(uniquePaths(m,n));
    }
    static int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        for (int i=0;i<m;i++){
            paths[i][0] = 1;
        }
        for (int i=0;i<n;i++){
            paths[0][i] = 1;
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                paths[i][j] = paths[i-1][j]+paths[i][j-1];
            }
        }
        for (int i=0;i<m;i++){
            System.out.println(Arrays.toString(paths[i]));
        }
        return paths[m-1][n-1];
    }
}
