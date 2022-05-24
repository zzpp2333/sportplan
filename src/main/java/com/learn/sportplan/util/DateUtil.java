package com.learn.sportplan.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 将时间转换为对应格式字符串的工具类 但目前数据库中没有储存DateTime或TimeStamp
public class DateUtil {
    private static final String YYYY_MM_DD = "yyyy-MM-dd";

    private static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public static String getDate(){
        SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD);
        return format.format(new Date());
    }

    public static String getDateTime(){
        SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        return format.format(new Date());
    }

    public static Date formatDate(String time){
        SimpleDateFormat format = new SimpleDateFormat();
        try {
            return format.parse(time);
        }catch (ParseException e){
            return null;
        }
    }
}
