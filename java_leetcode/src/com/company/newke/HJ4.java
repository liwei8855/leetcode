package com.company.newke;
import java.util.ArrayList;
import java.util.Scanner;

public class HJ4 {
    public static void main(String[] args){
        test();
    }

    static void test(){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string==null || string.length()==0) return;
        String[] strings = string.split(" ");
        if (strings.length<=0) return;
        for (int i=0;i<strings.length;i++){
            printString(strings[i]);
        }
    }
    static void printString(String string){
        if (string.length()<8){
            char[] c = new char[8-string.length()];
            for (int i=0;i<8-string.length();i++){
                c[i] = '0';
            }
            StringBuilder sb = new StringBuilder(string).append(c);
            System.out.println(sb.toString());
            return;
        }

        char[] chars = string.toCharArray();
        int count = 1;
        for (int i=0;i<chars.length;i++){
            if (count==8){
                count = 1;
            } else {
                count++;
            }
        }
    }
}