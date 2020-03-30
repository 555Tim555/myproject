package com.zy.parking;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2020,3,30,8,30);
        LocalDateTime leave = LocalDateTime.of(2020,3,30,10,30);
        Car car = new Car("AA-0001",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hour = (long) Math.ceil(car.getDuration()/60.0);
        System.out.println(hour);
        System.out.println(hour*30);

//        java8
        //Java8();
//        java();
    }

    private static void Java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2020,03,27,20,15,03);
        System.out.println(formatter.format(other));
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat spf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(spf.format(date));

        String s = "2020/03/26 20:30:00";
        try {
            Date other = spf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,5);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
