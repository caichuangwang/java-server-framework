package com.jsf.common.tools;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName StringUtil
 * @Description 字符串工具类
 * @Author caicw
 * @Date 2021/1/1 16:17
 */
public class JsfStringUtil {
    private final static Pattern pattern = Pattern.compile("[0-9]*\\.?[0-9]+");

    /**
     * 判断字符串是否为空
     *
     * @param str 被验证字符串
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() <= 0;
    }

    /**
     * 判断字符串是否为数字
     *
     * @param str         被验证字符串
     * @param ignoreEmpty 是否忽略字符串空值
     * @return
     */
    public static boolean isNumber(String str, boolean ignoreEmpty) {
        if (!ignoreEmpty) {
            throw new IllegalArgumentException("String must not be null");
        }
        if (isEmpty(str)) {
            return true;
        }
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
