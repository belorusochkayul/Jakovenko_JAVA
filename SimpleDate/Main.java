import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Задание 1. Вывести в консоль дату в виде: June 5th, 9:00 PM

        Date date = new Date();
        getFormattedDate(date);
        System.out.println(getFormattedDate(date));
    }

    public static String getFormattedDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DATE);

        switch (day % 10) {
            case 1:
                return new SimpleDateFormat("MMMM d'st', H:mm a").format(date);
            case 2:
                return new SimpleDateFormat("MMMM d'nd', H:mm a").format(date);
            case 3:
                return new SimpleDateFormat("MMMM d'rd', H:mm a").format(date);
            default:
                return new SimpleDateFormat("MMMM d'th', H:mm a").format(date);
        }
    }
}