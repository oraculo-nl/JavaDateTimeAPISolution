package solution.datetimeapi;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        var instant = Instant.ofEpochSecond(new Random().nextInt(1_000_000_000));
        var randomDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(randomDate);
        //Given the random date, find the date of the previous Thursday
        System.out.printf("The previous Thursday is: %s%n",
                randomDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
    }
}
