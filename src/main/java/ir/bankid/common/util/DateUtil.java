package ir.bankid.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static String jalaliToAd(String date) {
        String[] arrDate = new String[0];
        if (date.contains("/"))
            arrDate = date.split("/");
        if (date.contains("-"))
            arrDate = date.split("-");
        if (arrDate.length < 3)
            return null;
        CalendarTool calendarTool = new CalendarTool();
        int year = Integer.parseInt(arrDate[0]);
        int month = Integer.parseInt(arrDate[1]);
        int day = Integer.parseInt(arrDate[2]);
        calendarTool.setIranianDate(year, month, day);
        return calendarTool.getGregorianDateWithZeroInDay();
    }

    public static String adToJalali(String date) {

        try {
            Calendar calenderDate = Calendar.getInstance();
            Date dateObj = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            calenderDate.setTime(dateObj);
            CalendarTool calendarTool = new CalendarTool(calenderDate);
            return calendarTool.getIranianDate();

        } catch (ParseException e) {
            return null;
        }
    }

    public static String adToJalaliWithoutMonth(String date) {

        Calendar calenderDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
        String dateString = formatter.format(date);
        calenderDate.setTime(new Date());
        CalendarTool calendarTool = new CalendarTool(calenderDate);
        return calendarTool.getIranianDate();

    }

    public static String timeStampToJalali(Timestamp timeStamp) {
//        Timestamp ts = new Timestamp(Long.valueOf(timeStamp));
        return adToJalali(timeStamp.toString());
    }

    public static Timestamp jalaliToTimeStamp(String date) {
        final String ad = jalaliToAd(date);
        try {
            Date dateObj = new SimpleDateFormat("yyyy-MM-dd").parse(ad);
            return new Timestamp(dateObj.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date jalaliToDate(String date) {
        final String ad = jalaliToAd(date);
        try {
            Date dateObj = new SimpleDateFormat("yyyy-MM-dd").parse(ad);
            return dateObj;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String dateToSting(Date date) {
        SimpleDateFormat dateObj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateObj.format(date);
    }

    public static boolean isJalali(String date) {
        if (date == null)
            return false;
        String[] arrDate = date.split("/");
        if (arrDate.length < 3)
            return false;
        return true;
    }

    public static String getTimeStamp() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        return format.format(date);
    }

}
