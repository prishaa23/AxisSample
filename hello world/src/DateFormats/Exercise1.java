package DateFormats;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 14);
        Date dateAfterTwoWeeks = calendar.getTime();
        String formattedDate = sdf.format(dateAfterTwoWeeks);
        System.out.println("Date after 2 weeks: " + formattedDate);
    }
}
