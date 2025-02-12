package com.sjht.sdk.huicai.core.utils;

import java.security.MessageDigest;
import java.util.Objects;

/**
 * Md5加密方法
 *
 * @author 陈波
 */
public class Md5Utils {
    private static byte[] md5(String s) {
        MessageDigest algorithm;
        try {
            algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(s.getBytes("UTF-8"));
            byte[] messageDigest = algorithm.digest();
            return messageDigest;
        } catch (Exception e) {
            System.out.println("MD5 Error..." + e.getMessage());
        }
        return null;
    }

    private static final String toHex(byte[] hash) {
        if (hash == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer(hash.length * 2);
        int i;

        for (i = 0; i < hash.length; i++) {
            if ((hash[i] & 0xff) < 0x10) {
                buf.append("0");
            }
            buf.append(Long.toString(hash[i] & 0xff, 16));
        }
        return buf.toString();
    }

    public static String hash(String s) {
        try {
            return new String(Objects.requireNonNull(toHex(md5(s))).getBytes("UTF-8"), "UTF-8");
        } catch (Exception e) {
            System.out.println("not supported charset...{}" + e.getMessage());
            return s;
        }
    }
}