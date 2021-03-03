import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {

    public static Date strToDate(String strDate) {

        final String pattern = "yyyy-MM-dd HH:mm:ss Z";
        SimpleDateFormat template = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = template.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}