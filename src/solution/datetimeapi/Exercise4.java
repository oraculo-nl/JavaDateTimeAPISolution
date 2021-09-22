package solution.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Exercise4 {
    public static void main(String[] args) {
        //Given a stream of dates, check if the date is
        var dateStream = LocalDate.of(2021, 1, 1)
                .datesUntil(LocalDate.of(2021, 12, 31));
        dateStream.filter((date) -> date.getDayOfWeek()
                        .equals(DayOfWeek.SUNDAY) && date.get(ChronoField.DAY_OF_MONTH) == 10)
                .forEach(System.out::println);

    }
}
