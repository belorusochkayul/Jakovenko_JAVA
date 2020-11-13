import java.util.*;

public class Main {

    private static final int MEN = 1;
    private static final int WOMEN = 2;

    public static void main(String[] args) {

        List<String> male = new ArrayList<>();
        male.add("Антон Данилов");
        male.add("Глеб Морозов");
        male.add("Михаил Фаткулин");

        List<String> female = new ArrayList<>();
        female.add("Ирина Свиридович");
        female.add("Ольга Судникова");
        female.add("Полина Иванова");

        System.out.println("Имеющийся список Ф.И. : ");
        printList(male);
        printList(female);

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(MEN, male);
        map.put(WOMEN, female);

        System.out.println("Values from HashMap : ");
        printMap(map);

        System.out.println();
        System.out.println("Выберите ключ объекта для поиска: MEN = 1, WOMEN = 2");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value == MEN) {
            int randomIndex = new Random().nextInt(male.size());
            System.out.println(map.get(MEN).get(randomIndex));
        } else {
            int randomIndex = new Random().nextInt(female.size());
            System.out.println(map.get(WOMEN).get(randomIndex));
        }
    }

    public static void printMap(Map<Integer, List<String>> map) {
        for (List<String> value : map.values()) {
            System.out.print(value);
        }
    }

    public static void printList(List<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }
}