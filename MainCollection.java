package kipaaro.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCollection {
    private final static String STR_TO_DELETE = "a";

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println("Введите ваш массив строк:");
        System.out.println("Введите stop, когда введете все строки");
        input(list);
        System.out.println("Ваш массив строк");

        printinput(list);
        System.out.println("Ваш массив строк без симвовлов 'a' ");
        delete(list);
    }

    public static void input(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        final String EXIT = "stop";
        do {
            String str = scanner.next();
            if (str.equalsIgnoreCase(EXIT)) break;
            list.add(str);
        } while (!end);
    }

    public static void printinput(List<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }

    public static void delete(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replace(STR_TO_DELETE, ""));
            System.out.println(list.get(i));
        }
    }
}