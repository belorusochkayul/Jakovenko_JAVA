import java.util.*;

public class Main {

    private static final int MEN = 1;
    private static final int WOMEN = 2;

    public static void main(String[] args) {

        List<Object> femaleObj = new ArrayList<>();
        List<Object> maleObj = new ArrayList<>();

        maleObj.add(new Object("Hleb", "Frost"));
        maleObj.add(new Object("Artsiom", "Oborin"));
        maleObj.add(new Object("Egor", "Orlov"));
        femaleObj.add(new Object("Mary", "Smith"));
        femaleObj.add(new Object("July", "Frost"));

        System.out.println("Имеющийся список Ф.И. : ");
        printList(femaleObj);
        printList(maleObj);

        Map<Integer, List<Object>> map = new HashMap<>();
        map.put(MEN, maleObj);
        map.put(WOMEN, femaleObj);

        System.out.println("Values from HashMap : ");
        printMap(map);

        System.out.println();
        System.out.println("Выберите ключ объекта для поиска: MEN = 1, WOMEN = 2");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value == MEN) {
            int randomIndex = new Random().nextInt(maleObj.size());
            Object randomValue = maleObj.get(randomIndex);
            System.out.println(randomValue.getFirstName() + " " + randomValue.getSecondnName());
        } else {
            int randomIndex = new Random().nextInt(femaleObj.size());
            Object randomValue1 = femaleObj.get(randomIndex);
            System.out.println(randomValue1.getFirstName() + " " + randomValue1.getSecondnName());
        }
    }
    public static void printMap(Map<Integer, List<Object>> map) {
        for (int value : map.keySet()) {
            for (Object obj : map.get(value)) {
                System.out.print(obj.firstName + " " + obj.secondName + "_ ");
            }
        }
    }
    public static void printList(List<Object> list) {
        for (Object value : list) {
            System.out.println(value.getFirstName() + " " + value.getSecondnName());
        }
    }
}