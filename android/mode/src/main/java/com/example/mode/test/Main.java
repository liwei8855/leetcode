package com.example.mode.test;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import javax.crypto.Mac;
import java.util.Base64;


public class Main {

    public static String generateSignature(String token, String userId,
                                           String countryCode, String key, long timeStamp) {
        return hmacSHA256(token + userId + countryCode + timeStamp, key,
                Base64.NO_WRAP | Base64.NO_PADDING);
    }


    public static String hmacSHA256(String data, String key, int flag) {
        final byte[] result = signHMAC(256, key.getBytes(), data.getBytes());
        return result != null ? Base64.encodeToString(result, flag) : "";
    }

    private static byte[] signHMAC(int shaVersion, byte[] key, byte[] data) {
        SecretKey secret = new SecretKeySpec(key, "HmacSHA256");
        try {
            final Mac mac = Mac.getInstance(secret.getAlgorithm());
            mac.init(secret);
            return mac.doFinal(data);
        } catch (InvalidKeyException e) {
            return null;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String value = generateSignature("e676c0bcafabb390b71c166acc5ab77f","0f59846ea3d2493cbaf0ab2f50af5b06","us","W63u5nhR3ta2LcG0pK2M7Dp46N9cNNnV",1613984853);
        System.out.print(value);
    }

}
