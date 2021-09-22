package solution.datetimeapi;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Exercise3 {
    public static void main(String[] args) {
        //Given a certain year and month, print the dates of all the Mondays of that month.
        var yearMonth = YearMonth.of(2000, 10);
        var year = Year.of(yearMonth.getYear());
        var month = yearMonth.getMonth();
        var localDate = year.atMonth(month.getValue()).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        var mi = localDate.getMonth();
        while (mi == month) {
            System.out.println(localDate +" "+ localDate.getDayOfWeek());
            localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = localDate.getMonth();

        }
    }


}
