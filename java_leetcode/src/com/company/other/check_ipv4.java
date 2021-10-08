package com.company.other;

public class check_ipv4 {
    public static void main(String[] args) {

    }

    static boolean isIpv4(String string){
        //192.168.0.1
        //192.168.0.01
        if (string == null) return false;
        if (string.length() > 15 || string.length()<7){
            return false;
        }
        String[] array = string.split(String.valueOf('.'));
        if (array.length != 4) return false;
        for (int i=0;i<array.length;i++){
            String subString = array[i];
            boolean result = isIpv4SubString(subString);
            if (result == false) {
                return false;
            }
        }
        return true;
    }

    static boolean isIpv4SubString(String string){
        if (string.length()>3||string.length()<=0){
            return false;
        }

        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);

            if (c<0 && c>9){
                return false;
            }
        }
        int value = Integer.parseInt(string);
        if (value < 0 || value>255){
            return false;
        }
        return true;
    }
}
