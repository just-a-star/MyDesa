package util;

import java.time.LocalDate;

public class DateIncrementer {

    public static String addOneDay(int n) {
        String date = LocalDate.now().toString();
        return LocalDate.parse(date).plusDays(n).toString();
    }
}
