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
        Student student = new Student(name, age);
        students.add(new Student(student.getName(), student.getAge()));
        printInput(students);
        search(students);
    }

    public static void search(List<Student> students) {
        System.out.println("Введите возраст студента для поиска");
        Scanner scanner = new Scanner(System.in);
        int ageForSearch = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() == ageForSearch) {
                System.out.println("Найденный студент: " + students.get(i).getName() + students.get(i).getAge());
                break;
            }
        }
    }

    public static void printInput(List<Student> students) {
        for (Student value : students) {
            System.out.println("Имя студента: " + value.getAge() + " возраст студента: " + value.getName());
        }
    }
}