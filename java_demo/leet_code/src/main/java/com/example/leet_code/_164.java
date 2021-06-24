package com.example.leet_code;
//最大间距

public class _164 {
    public static void main(String[] args) {
        int[] arr = {3,6,9,1};
        System.out.print(max(arr));
    }

    static int max(int[] arr){
        if (arr.length<2) return 0;
        int max = 0;
        for (int j=0;j<arr.length-1;j++){
            int min = Math.abs(arr[j]-arr[j+1]);
            for (int i=j+1;i<arr.length;i++){
                int tmp = Math.abs(arr[i]-arr[j]);
                if (tmp<min){
                    min = tmp;
                }
            }
            System.out.println(max+"__"+min);
            if (min>max){
                max = min;
            }
        }
        return max;
    }
}
