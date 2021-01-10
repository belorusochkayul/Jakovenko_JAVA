package kiparo.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userInputNumber = enterCarNumber();
        String reg = "\\d{4}\\s[A-Z]{2}[-][1-7]";
        Reg regular = new Reg();
        boolean regCheck = regular.regCarNumber(reg, userInputNumber);
        String printResult = regular.IsCarNumberIsBelorussianPrint(regular.userInputNumberFormatted(userInputNumber), regCheck);
        System.out.println(printResult);
    }

    public static String enterCarNumber() {
        System.out.println("Введите номер авто");
        Scanner sc = new Scanner(System.in);
        String userInputNumber = sc.nextLine();
        return userInputNumber;
    }
}