package core;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeExample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(new Date());
        //calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(lastDay);
        calendar.getFirstDayOfWeek();
    }
}
