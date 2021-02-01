package parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {
    public static Date strToDate(String strDate) {
        SimpleDateFormat template = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        Date date = null;
        try {
            date = template.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}