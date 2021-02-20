package com.jsf.common.tools;

import org.springframework.util.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.apache.commons.lang.time.DateUtils.add;
import static org.apache.commons.lang.time.DateUtils.truncate;

/**
 * @ClassName DateUtil
 * @Description 日期工具类
 * @Author caicw
 * @Date 2021/1/1 16:18
 */
public class JsfDateUtil {
    private final static Calendar cal1 = Calendar.getInstance();

    private final static Calendar cal2 = Calendar.getInstance();

    private final static String[] parsePatterns = {"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM-dd",
            "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM/dd", "yyyyMMddHHmm", "yyyyMMdd HH:mm:ss", "yyyyMMdd"};

    /**
     * 格式化日期
     *
     * @param date
     * @param pattern 格式化规则
     * @return
     */
    public static String formatDate(Date date, String pattern) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 格式化日期，格式:yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        return formatDate(date, parsePatterns[2]);
    }

    /**
     * 格式化日期，格式:yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String formatDateTime(Date date) {
        return formatDate(date, parsePatterns[0]);
    }

    /**
     * 获取指定日期的00:00:00
     *
     * @param when 指定日期
     * @return
     */
    public static Date getDay(Date when) {
        Assert.notNull(when, "date must not be null");

        Date date = truncate(when, Calendar.DATE);
        date.setTime(date.getTime());

        return date;
    }

    /**
     * 获取指定日期的23:59:59
     *
     * @param when 指定日期
     * @return
     */
    public static Date getDayEnd(Date when) {
        Assert.notNull(when, "date must not be null");

        Date date = truncate(when, Calendar.DATE);
        date = add(date, Calendar.DAY_OF_YEAR, 1);
        date.setTime(date.getTime() - 1);

        return date;
    }

    /**
     * 获取指定日期所在月的第一天
     *
     * @param date 指定日期
     * @return
     */
    public static Date getFirstDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int last = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, last);
        return cal.getTime();
    }

    /**
     * 获取指定日期所在月的最后一天
     *
     * @param date 指定日期
     * @return
     */
    public static Date getLastDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, last);
        return cal.getTime();
    }

    /**
     * 判断日期是否为相同年月
     *
     * @param date1 指定日期
     * @param date2 指定日期
     * @return
     */
    public static boolean isSameMonth(Date date1, Date date2) {
        if (date1 == null && date2 == null) {
            throw new IllegalArgumentException("date must not be null");
        }
        if ((date1 == null && date2 != null) || (date1 != null && date2 == null)) {
            return false;
        }
        cal1.setTime(date1);
        cal2.setTime(date2);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
    }
}
