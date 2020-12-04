import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2 {

    public static void main(String[] args) {

        // конвертировать строку "2017-06-05 20:25" в объект Date
        String strDate = "2017-06-05 20:25";
        SimpleDateFormat template = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = null;
        try {
            date = template.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        // возвращает Mon Jun 05 20:25:00 MSK 2017
    }
}