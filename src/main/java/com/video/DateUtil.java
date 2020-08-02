package com.video;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {



    public static String getDisTime(String str1, String str2) {
        str1="2018-01-01 "+str1;
        str2="2018-01-01 "+str2;

        return getDistanceTime(str1,str2);
    }

    /**
     * 两个时间相差距离多少天多少小时多少分多少秒
     * @param str1 时间参数 1 格式：1990-01-01 12:00:00
     * @param str2 时间参数 2 格式：2009-01-01 12:00:00
     * @return String 返回值为：xx天xx小时xx分xx秒
     */
    public static String getDistanceTime(String str1, String str2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date one;
        Date two;
        long day = 0;
        long hour = 0;
        long min = 0;
        long sec = 0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            day = diff / (24 * 60 * 60 * 1000);
            hour = (diff / (60 * 60 * 1000) - day * 24);
            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //return day + "天" + hour + "小时" + min + "分" + sec + "秒";

        String hourstr=hour+"";
        String minstr=min+"";
        String secstr=sec+"";
        if(hour<10){
            hourstr="0"+hour;
        }
        if(min<10){
            minstr="0"+min;
        }
        if(sec<10){
            secstr="0"+sec;
        }
        return  hourstr + ":" + minstr + ":" + secstr ;
    }


    public static void main(String args[]){
        String str1="00:06:44";
        String str2="01:09:04";
        String result=getDisTime(str1,str2);
        System.out.println(result);
    }


}
