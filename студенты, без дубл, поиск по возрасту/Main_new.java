import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_new {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Maggy", 25));
        students.add(new Student("Maggy", 25));
        students.add(new Student("Ann", 21));
        students.add(new Student("Dan", 18));
        students.add(new Student("Maggy", 25));
        students.add(new Student("Dan", 18));
        students.add(new Student("Polly", 18));
        students.add(new Student("Ann", 21));
        students.add(new Student("Dan", 18));

        students
                .stream()
                .forEach(val -> System.out.println("Имя студента: " + val.getName() + " Возраст студента: " + val.getAge()));

        System.out.println("Студенты без дублирования: ");
        students
                .stream()
                .distinct()
                .forEach(val -> System.out.println("Имя студента: " + val.getName() + " Возраст студента: " + val.getAge()));

        System.out.println("Введите возраст студента для поиска: ");
        Scanner scan = new Scanner(System.in);
        int ageForSearch = scan.nextInt();

        students
                .stream()
                .distinct()
                .filter(val -> val.getAge() == ageForSearch)
                .forEach(val -> System.out.println("Имя студента: " + val.getName() + " Возраст студента: " + val.getAge()));
    }
}