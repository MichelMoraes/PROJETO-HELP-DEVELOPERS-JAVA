package com.br.devs.java.api.util;

import java.time.LocalDateTime;

public class DateUtil {

    public static String getDay(LocalDateTime dateTime) {
        return padLeftZeros(String.valueOf(dateTime.getDayOfMonth()), 1);
    }

    public static String getMonth(LocalDateTime dateTime) {
        return padLeftZeros(String.valueOf(dateTime.getMonthValue()), 1);
    }

    public static String getYear(LocalDateTime dateTime) {
        return padLeftZeros(String.valueOf(dateTime.getYear()), 1);
    }

    public static String getHour(LocalDateTime dateTime) {
        return padLeftZeros(String.valueOf(dateTime.getHour()), 1);
    }

    public static String getMinute(LocalDateTime dateTime) {
        return padLeftZeros(String.valueOf(dateTime.getMinute()), 1);
    }

    public static String getSecond(LocalDateTime dateTime) {
        return padLeftZeros(String.valueOf(dateTime.getSecond()), 1);
    }

    public static String padLeftZeros(String inputString, int length) {
        StringBuilder sb = new StringBuilder();
        if (inputString.length() == length) {
            sb.append("0");
            sb.append(inputString);
            return sb.toString();
        }
        return inputString;
    }
}
