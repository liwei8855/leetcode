package com.company.leetcode;

import com.sun.tools.javac.code.Attribute;

import java.util.Arrays;
import java.util.Stack;

public class _739 {
    public static void main(String[] args) {
//        int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
        int[] temperatures = new int[] {30,40,50,60};
        _739 o = new _739();
        int[] arr = o.dailyTemperatures2(temperatures);
        System.out.println(Arrays.toString(arr));
    }

    public int[] dailyTemperatures2(int[] temperatures) {
        if (temperatures==null||temperatures.length==0) return null;
        int[] result = new int[temperatures.length];
        for (int i=temperatures.length-2;i>=0;i--){
            int j = i+1;
            while (true){
                if (temperatures[j]>temperatures[i]){
                    result[i] = j-i;
                    break;
                } else if(temperatures[j]==temperatures[i]){
                    result[i] = result[j]+j-i;
                    break;
                }
                if (result[j]==0){
                    result[i] = 0;
                    break;
                }
                j += result[j];
            }
        }
        return result;
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
