import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] arg) {

        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя студента");
        String name = scanner.nextLine();
        System.out.println("Введите возраст студента");
        int age = scanner.nextInt();
        students.add(new Student(name, age));
        printInput(students);

        System.out.println("Введите возраст студента для поиска");
        Scanner scan = new Scanner(System.in);
        int ageForSearch = scan.nextInt();
        List<Student> seachResult = search(students, ageForSearch);
        System.out.println("Найденные студенты: ");
        printInput(seachResult);
    }

    public static List<Student> search(List<Student> students, int ageForSearch) {

        List<Student> filter = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() == ageForSearch) {
                filter.add(students.get(i));
                break;
            }
        }
        return filter;
    }

    public static void printInput(List<Student> students) {
        for (Student value : students) {
            System.out.println("Имя студента: " + value.getAge() + " возраст студента: " + value.getName());
        }
    }
}