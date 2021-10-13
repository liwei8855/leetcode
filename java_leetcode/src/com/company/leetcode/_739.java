package com.company.leetcode;

import com.sun.tools.javac.code.Attribute;

import java.util.Arrays;
import java.util.Stack;

public class _739 {
    public static void main(String[] args) {
        int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
        _739 o = new _739();
        int[] arr = o.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(arr));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures==null||temperatures.length==0) return null;
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack();
        for (int i=0;i<temperatures.length;i++){
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                Integer index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }

}
