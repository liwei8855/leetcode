package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _03 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.print(lengthOfLongestSubstring(str));
    }
    static int lengthOfLongestSubstring(String s) {
        if (s==null) return 0;

        int maxLength = 0;
        Set<Character> charSet = new HashSet<Character>();
        int i=0,j=0;
        while (i<s.length() && j<s.length()){
            if (!charSet.contains(s.charAt(j))){
                charSet.add(s.charAt(j));
                maxLength = Math.max(maxLength,charSet.size());
                j++;
            } else {
                charSet.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
