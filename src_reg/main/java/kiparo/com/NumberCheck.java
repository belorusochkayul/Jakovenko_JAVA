package kiparo.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCheck {

    private final static String BY = "BY";
    private final static String NOTBY = "NOT BY";
    private final static String BEL_CAR_NUMBER_REG = "\\d{4}\\s[A-Z]{2}[-][1-7]";

    public static String cleanCarNumberExceptNumberLetters(String carNumber) {
        String formResult = carNumber.replaceAll("[^\\p{L}\\p{N}]", "");
        return formResult;
    }

    public static boolean isBelarusCarNumber(String carNumber) {
        Pattern pattern = Pattern.compile(BEL_CAR_NUMBER_REG);
        Matcher matcher = pattern.matcher(carNumber);
        return matcher.matches();
    }

    public static String formatCarNumber(String carNumber, boolean isBelarusCarNumber) {
        if (isBelarusCarNumber) {
            return carNumber + BY;
        } else return carNumber + NOTBY;
    }
}