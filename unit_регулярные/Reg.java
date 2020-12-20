package kiparo.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

    final String BY = " - BY";
    final String NOTBY = " - NOT BY";

    public String regCheck(String reg, String userInputNumber) {
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(userInputNumber);
        String printResult = userInputNumber.replaceAll("[^\\p{L}\\p{N}]", "");

        if (matcher.matches()) {
            System.out.println(printResult + BY);
        } else {
            System.out.println(printResult + NOTBY);
        }
        return printResult;
    }
}