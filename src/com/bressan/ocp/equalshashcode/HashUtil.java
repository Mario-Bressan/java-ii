package com.bressan.ocp.equalshashcode;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtil {

    static int generateHash(String s) {
        int hexa = 0;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(s.getBytes(),0,  s.length());
            byte[] digest = messageDigest.digest();
            hexa = new BigInteger(1, digest).intValue();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hexa;
    }
}
