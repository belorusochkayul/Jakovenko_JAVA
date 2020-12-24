package kipaaro.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_new {

    public static void main(String[] args) {
        System.out.println("Введите ваш массив целых чисел:");
        List<Integer> list = new ArrayList<>();
        input(list);
        System.out.println("Числа, отсортированные в порядке возрастания: ");
        list
                .stream()
                .distinct()
                .sorted()
                .forEach(val -> System.out.println(val));
    }

    public static void input(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        final int EXIT = 0;
        do {
            Integer val = scanner.nextInt();
            if (val.equals(EXIT)) break;
            list.add(val);
        } while (!end);
    }
}