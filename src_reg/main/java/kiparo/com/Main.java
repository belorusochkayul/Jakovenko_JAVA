package kiparo.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String carNumber = enterCarNumber();
        boolean isNumberBel = NumberCheck.isBelarusCarNumber(carNumber);
        String printResult = NumberCheck.formatCarNumber(NumberCheck.cleanCarNumberExceptNumberLetters(carNumber), isNumberBel);
        System.out.println(printResult);
    }

    public static String enterCarNumber() {
        System.out.println("Введите номер авто");
        Scanner sc = new Scanner(System.in);
        String carNumber = sc.nextLine();
        return carNumber;
    }
}