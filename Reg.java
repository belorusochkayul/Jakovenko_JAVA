package kiparo.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

    final static String BY = "BY";
    final static String NOTBY = "NOT BY";

    public String userInputNumberFormatted(String userInputNumber) {
        String formResult = userInputNumber.replaceAll("[^\\p{L}\\p{N}]", "");
        return formResult;
    }

    public boolean regCarNumber(String reg, String userInputNumber) {
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(userInputNumber);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public String IsCarNumberIsBelorussianPrint(String userInputNumber, boolean result) {
        if (result) {
            return userInputNumber + BY;
        } else return userInputNumber + NOTBY;
    }
}