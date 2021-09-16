package com.company.leetcode;

public class _151 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String r =  reverseWords(s);
        System.out.print(r);
    }
    static String reverseWords(String s) {
        int len = 0;
        char[] arr = s.toCharArray();
        boolean isSpace = true;
        for (int i=0;i<arr.length;i++){
            if (arr[i] != ' '){
                arr[len] = arr[i];
                len++;
            } else {
                if (!isSpace){
                    arr[len] = arr[i];
                    len++;
                }
            }
        }

        return arr.toString();
    }
}
