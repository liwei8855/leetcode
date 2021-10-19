package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _03 {
    public static void main(String[] args) {
        String str = "bbbbb";// "pwwkew";// "abcabcbb";
        _03 o = new _03();
        System.out.print(o.lengthOfLongestSubstring(str));
    }

    private int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() ==0) return 0;
        //上一次出现的位置
        int max = 0;
        Map<Character,Integer> prevIndexs = new HashMap<>();
        int li = 0;
        char[] chars = s.toCharArray();
        prevIndexs.put(chars[0],0);
        for (int i=1;i<chars.length;i++){
            int pi = prevIndexs.getOrDefault(chars[i],-1);
            if (pi>=li){
                li=pi+1;
            }
            prevIndexs.put(chars[i],i);
            max = Math.max(max,i-li+1);
        }
        return max;
    }

//    static int lengthOfLongestSubstring(String s) {
//        if (s==null) return 0;
//
//        int maxLength = 0;
//        Set<Character> charSet = new HashSet<Character>();
//        int i=0,j=0;
//        while (i<s.length() && j<s.length()){
//            if (!charSet.contains(s.charAt(j))){
//                charSet.add(s.charAt(j));
//                maxLength = Math.max(maxLength,charSet.size());
//                j++;
//            } else {
//                charSet.remove(s.charAt(i));
//                i++;
//            }
//        }
//        return maxLength;
//    }
}
