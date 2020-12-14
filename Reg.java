import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

    public static void main(String[] args) {
        final String BY = " - BY";
        final String NOTBY = " - NOT BY";

        String userInputNumber = enterCarNumber();
        String reg = "\\d{4}\\s[A-Z]{2}[-][1-7]";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(userInputNumber);
        String printResult = userInputNumber.replaceAll("[^\\p{L}\\p{N}]", "");

        if (matcher.matches()) {
            System.out.println(printResult + BY);
        } else {
            System.out.println(printResult + NOTBY);
        }
    }

    public static String enterCarNumber() {
        System.out.println("Введите номер авто");
        Scanner sc = new Scanner(System.in);
        String userInputNumber = sc.nextLine();
        return userInputNumber;
    }
}