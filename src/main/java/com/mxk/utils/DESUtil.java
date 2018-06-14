package com.mxk.utils;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

/**
 * Created by mengxk on 2018/6/14.
 */
public class DESUtil {
    public static String getKeyDES() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        keyGenerator.init(56);
        SecretKey secretKey = keyGenerator.generateKey();
        String base64Str = byte2base64(secretKey.getEncoded());
        return base64Str;
    }

    private static String byte2base64(byte[] encoded) {
        return "";
    }
}
