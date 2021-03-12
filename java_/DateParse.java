import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {
    public static final String pattern = "yyyy-MM-dd HH:mm:ss Z";

    public static Date strToDate(String strDate) {
        SimpleDateFormat template = new SimpleDateFormat(pattern);
        try {
            return template.parse(strDate);
        } catch (ParseException e) {
            return null;
        }
    }
}