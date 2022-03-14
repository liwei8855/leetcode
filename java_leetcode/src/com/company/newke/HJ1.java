package com.company.newke;
import java.util.Scanner;
public class HJ1 {
    public static void main(String[] args) {
        test();
    }

    static void test(){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        if (string.length()<=0){
            System.out.println(0);
            return;
        }
        String[] strArr = string.split(" ");
        if (strArr.length<=0){
            System.out.println(0);
            return;
        }
        String subString = strArr[strArr.length-1];
        System.out.println(subString.length());
    }
}
