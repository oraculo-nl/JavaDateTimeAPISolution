package solution.datetimeapi;

import java.time.Month;
import java.time.YearMonth;

public class Exercise2 {

    public static void main(String[] args) {
        //given an arbitrary year, print out the names of the months and the lengths of the months.
        //Hint: use YearMonth and Month.values()
        var year = 2001;
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
        }
    }
}
