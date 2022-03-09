package com.company.other;

import java.awt.*;

public class check_ipv4 {
    public static void main(String[] args) {
        String ipv4 = "192.1.1.1";
        System.out.println(isIpv4(ipv4));
    }

    static boolean isIpv4(String string){
        //192.168.0.1
        //192.168.0.01
        if (string == null || string.length() == 0) return false;
        if (string.length() > 15 || string.length()<7){
            return false;
        }
        String[] array = string.split("\\.");
        if (array.length != 4) return false;
        for (int i=0;i<array.length;i++){
            String subString = array[i];
            if (subString.length()==0 || subString==null) return false;

            if (i==0){
                String c = subString.substring(0,1);
                System.out.println(c);
                int num = Integer.parseInt(c);
                if (num == 0) return false;
            }

            int n = Integer.parseInt(subString);
            if (n<0 || n>255) return false;
            return true;
        }
        return true;
    }
}
