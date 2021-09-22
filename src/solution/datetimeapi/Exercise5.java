package solution.datetimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise5 {
    public static void main(String[] args) {
        //Print an arbitrary day in the following format in your own locale, e,g, Dutch
        //Add a period of 2 years, 3 months, 3 weeks and 2 days to this date and print the result in the same format
        var birthday = LocalDate.of(2001, 3, 8);
        var dtf = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.forLanguageTag("nl"));
        System.out.println(birthday.format(dtf));
        var p0 = Period.ofYears(2);
        var p = Period.ofMonths(3);
        var p2 = Period.ofWeeks(3);
        var p3 = Period.ofDays(2);
        birthday = birthday.plus(p)
                .plus(p2)
                .plus(p3)
                .plus(p0);
        System.out.println(birthday.format(dtf));
    }

}
