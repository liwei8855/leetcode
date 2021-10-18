package com.company.leetcode;

public class _242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaran";
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
        if (s==null || t==null || s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int[] counts = new int[26];
        for (int i=0;i<sArray.length;i++){
            counts[sArray[i]-'a']++;
        }
        for (int i=0;i<tArray.length;i++){
            if (--counts[tArray[i]-'a']<0) return false;
        }
        return true;
    }
}
