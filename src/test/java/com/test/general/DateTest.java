package com.test.general;

import cn.hutool.core.date.LocalDateTimeUtil;
import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @Author:
 * @CreateTime: 2022-08-24  09:05
 * @Description:
 */
public class DateTest {


    @Test
    public void timeZoneTest() {
        ZoneId zone1 = ZoneId.of("Asia/Shanghai");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println(now1.isBefore(now2));  // false
        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
        System.out.println(hoursBetween);       // -3
        System.out.println(minutesBetween);     // -239
    }

    @Test
    public void LocalTimeTest() {
        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late);       // 23:59:59
        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedTime(FormatStyle.SHORT)
                        .withLocale(Locale.GERMAN);
        LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
        System.out.println(leetTime);   // 13:37
    }

    @Test
    public void localDateTest() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        // 今天加一天
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        System.out.println("今天加一天" + tomorrow);
        // 明天减两天
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println("明天减两天" + yesterday);
        // 2014 年七月的第四天
        LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println(dayOfWeek);    // 星期五

        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);
        LocalDate xmas = LocalDate.parse("24.12.2014", germanFormatter);
        System.out.println(xmas);   // 2014-12-24
    }

    @Test
    public void LocalDateTimeTest(){

        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
        Instant instant = sylvester
                .atZone(ZoneId.systemDefault())
                .toInstant();
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);     // Wed Dec 31 23:59:59 CET 2014


        LocalDateTime sylvester1 = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
        DayOfWeek dayOfWeek = sylvester1.getDayOfWeek();
        System.out.println(dayOfWeek);      // 星期三
        Month month = sylvester1.getMonth();
        System.out.println(month);          // 十二月
        // 获取改时间是该天中的第几分钟
        long minuteOfDay = sylvester1.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay);    // 1439
    }

    @Test
    public void timeForHuToolTest(){

        LocalDateTime now = LocalDateTimeUtil.now();
        System.out.println(now);
        String format = LocalDateTimeUtil.format(LocalDateTime.now(), "yyyy-mm-dd hh:mm:ss");
        System.out.println(format);
    }
}
