package kiparo.com;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInputNumber = enterCarNumber();
        String reg = "\\d{4}\\s[A-Z]{2}[-][1-7]";
        Reg regular = new Reg();
        regular.regCheck(reg, userInputNumber);
    }

    public static String enterCarNumber() {
        System.out.println("Введите номер авто");
        Scanner sc = new Scanner(System.in);
        String userInputNumber = sc.nextLine();
        return userInputNumber;
    }
}