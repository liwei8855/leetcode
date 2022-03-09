package com.company.newke;

import java.util.HashMap;
import java.util.Scanner;

public class HJ2 {

    public static void main(String[] args) {
//        String string = "8 8 8  8A i i OOI              IIIaa";
        test();
    }

    static void test(){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char n = sc.next().charAt(0);
        System.out.println(string);
        System.out.println(n);
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<=string.length()-1;i++){
            Character c = string.charAt(i);
            int key = getKey(c);
            System.out.println(key);
            int count = 1;
            if (map.containsKey(key)){
                count += map.get(key);
            }
            map.put(key,count);
        }
        if (map.containsKey(getKey(n))){
            System.out.println(map.get(getKey(n)));
        } else  {
            System.out.println(0);
        }

    }
    static int getKey(Character c){
        System.out.println(c);
        int k = (int)c;
        if(k>=65 && k < 97){
            k += 32;
        }
        return k;
    }
}
