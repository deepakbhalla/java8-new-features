package com.example.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentDateAndTime {

    private static final String DATE_FORMAT_1 = "yyyy/MM/dd";
    private static final String DATE_FORMAT_2 = "yyyy/MMM/dd";
    private static final String DATE_FORMAT_3 = "yyyy/MMMM/dd";
    private static final String TIME_FORMAT = "HH:mm:ss";
    private static final String DATE_TIME_FORMAT = "MMMM dd, yyyy HH:mm:ss";

    public static void main(String[] args) {
        getCurrentDate();
        formatCurrentDate();
        getCurrentTimeAndFormat();
        getCurrentDateAndTimeAndFormat();

        // get current date-time, with system default time zone
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(dtf.format(now)); // 2021/03/22 16:37:15
        System.out.println(now.getOffset()); // +08:00

        // get current date-time, with a specified time zone
        ZonedDateTime japanDateTime = now.withZoneSameInstant(ZoneId.of("Asia/Dubai"));
        System.out.println(dtf.format(japanDateTime)); // 2021/03/22 17:37:15
        System.out.println(japanDateTime.getOffset()); // +09:00

    }

    private static void getCurrentDateAndTimeAndFormat() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time with default format: " + now);

        DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        System.out.println("Current date and time with uuuu/MM/dd HH:mm:ss format: " + now.format(df));
    }

    private static void getCurrentTimeAndFormat() {
        LocalTime now = LocalTime.now();
        System.out.println("Current time with default format: " + now);

        DateTimeFormatter df = DateTimeFormatter.ofPattern(TIME_FORMAT);
        System.out.println("Current time with HH:mm:ss format: " + now.format(df));
    }

    private static void formatCurrentDate() {
        LocalDate now = LocalDate.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE_FORMAT_1);
        System.out.println("Today date with yyyy/MM/dd format: " + now.format(df));

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern(DATE_FORMAT_2);
        System.out.println("Today date with yyyy/MMM/dd format: " + now.format(df1));

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern(DATE_FORMAT_3);
        System.out.println("Today date with yyyy/MMMM/dd format: " + now.format(df2));
    }

    private static void getCurrentDate() {
        LocalDate now = LocalDate.now();
        System.out.println("Today's Date with default format: " + now);
    }
}
