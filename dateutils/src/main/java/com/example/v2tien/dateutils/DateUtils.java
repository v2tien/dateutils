package com.example.v2tien.dateutils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String getTime(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("kk:mm");
        return simpleDateFormat.format(date);
    }
}
