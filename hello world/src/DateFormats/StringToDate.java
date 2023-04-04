package DateFormats;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class StringToDate {
    public static void main(String[] args) throws ParseException {
        int date=31;
        int month =07;
        int year =2001;
        String in = date+ "/"+ month+"/"+year;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date theDate = sdf.parse(in);
        System.out.println("Date parsed = "+sdf.format(theDate));
    }
}
