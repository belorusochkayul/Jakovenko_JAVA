import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class MainMaxMin {

    public static void main(String[] args) {
        System.out.println("Введите N целочиленных элементов массива:");
        List<Integer> list = new ArrayList<>();
        input(list);

        OptionalInt min = list
                .stream()
                .mapToInt(Integer::intValue)
                .min();
        Integer resultMin = min.getAsInt();


        OptionalInt max = list
                .stream()
                .mapToInt(Integer::intValue)
                .max();
        Integer resultMax = max.getAsInt();

        list.stream()
                .map(val -> val.toString())
                .map(val -> val.replaceAll(resultMax.toString(), "99"))
                .map(val -> val.replaceAll(resultMin.toString(), "0"))
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