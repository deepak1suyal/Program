package DateandTime;

import java.time.LocalDate;
import java.time.Month;

public class localdate {
    public static void main(String[] args) {
        LocalDate T=LocalDate.now();
        System.out.println(T);
        LocalDate coustomDate = LocalDate.of(1990, 2, 7);
        int dayofMonth=T.getDayOfMonth();
        Month month=T.getMonth();
        int year=T.getYear();
        System.out.println("Date "+ coustomDate);
        System.out.println("Date "+ dayofMonth);
        System.out.println("Date "+ month);
        System.out.println("Date "+ year);
    }
}
