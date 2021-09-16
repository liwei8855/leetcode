package com.company.leetcode;

import java.sql.Struct;

public class _05 {
    public static void main(String[] args) {
        String string = "cbbd";
        String s = longestPalindrome(string);
        System.out.println(s);
    }
    static String longestPalindrome(String s) {
        if (s.equals("") || s.length()==0) return "";
        String maxString = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i=0;i<s.length();i++){
            for (int j=0;j<=i;j++){
                if (s.charAt(j)==s.charAt(i) && i-j<2){
                    //相邻两个字符相等 是回文子串
                    dp[j][i] = true;
                } else if (s.charAt(i)==s.charAt(j) && dp[j+1][i-1] && i-j>1){
                    //两个字符不相邻，就要j++ i--看子串是不是回文，
                    //是则j，i也是，不是则j，i不是
                    dp[j][i] = true;
                }
                if (dp[j][i] && maxString.length()<i-j+1){
                    maxString = s.substring(j,i+1);
                }
            }
        }
        return maxString;
    }
}
