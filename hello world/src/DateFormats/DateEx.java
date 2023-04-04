package DateFormats;

import java.util.Date;
import java.lang.Object;
import java.util.Calendar;

public class DateEx {
    public static void main(String[] args) {

        Date date = new Date();
        Date d = new Date(0301,7,31);
        int comparison=date.compareTo(d);
        System.out.println("Your comparison value is : "+comparison);
        System.out.println(date);
        System.out.println(d);
        System.out.println("Date 'date' is after Date 'd' : "+d.after(d));



    }
}