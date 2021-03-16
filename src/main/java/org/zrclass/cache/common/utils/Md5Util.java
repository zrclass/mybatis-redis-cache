package org.zrclass.cache.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Md5
 *
 * @author 20106367
 * @date 2020-12-10
 */
@Slf4j
public class Md5Util {

    /**
     * 全局数组
     */
    private static final String[] STRDIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A",
            "B", "C", "D", "E", "F"};

    /**
     * 返回形式为数字跟字符串
     */
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return STRDIGITS[iD1] + STRDIGITS[iD2];
    }

    /**
     * 转换字节数组为16进制字串
     */
    private static String byteToString(byte[] bByte) {
        StringBuilder sBuffer = new StringBuilder();
        for (byte b : bByte) {
            sBuffer.append(byteToArrayString(b));
        }
        return sBuffer.toString();
    }

    /**
     * MD5加密生成32大写
     *
     * @param str 待加密的字符串
     */
    public static String getMD5Code(String str) {
        String result = str;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            result = byteToString(md.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            log.error(ex.getMessage());
        }
        return result;
    }
}
