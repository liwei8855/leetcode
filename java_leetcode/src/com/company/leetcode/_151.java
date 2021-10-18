package com.company.leetcode;

import java.util.Arrays;

public class _151 {
    public static void main(String[] args) {
        String s = "the sky is blue";// "  hello world  ";
        String r =  reverseWords(s);
        System.out.print(r);
    }

    static String reverseWords(String s){
        if (s.length()<=0) return "";
        char[] array = s.toCharArray();
        int stringLength = 0;
        boolean space = true;
        int cur = 0;
        for (int i=0;i<array.length;i++){
            if (array[i] != ' '){
                array[cur++] = array[i];
                space = false;
            } else if (space == false){
                array[cur++] = array[i];
                space = true;
            }
        }
        stringLength = space?cur-1:cur;
        if (stringLength<=0) return "";

        System.out.println("length"+stringLength);
        System.out.println(Arrays.toString(array));

        revert(array,0,stringLength-1);
        System.out.println(Arrays.toString(array));
        int begin = 0;
        for (int i=0;i<stringLength;i++){
            if (array[i]==' '){
                revert(array,begin,i-1);
                begin = i+1;
            }
        }
        revert(array,begin,stringLength-1);
        return new String(array,0,stringLength);// Arrays.toString(array);
    }

    static void revert(char[] array,int l,int r){
        if (l>=r) return;
        while (l<r){
            char tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
            l++;r--;
        }
    }

//    static String reverseWords(String s) {
//        int len = 0;
//        char[] arr = s.toCharArray();
//        boolean isSpace = true;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] != ' '){
//                arr[len] = arr[i];
//                len++;
//            } else {
//                if (!isSpace){
//                    arr[len] = arr[i];
//                    len++;
//                }
//            }
//        }
//        return arr.toString();
//    }
}
