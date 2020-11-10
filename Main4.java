import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Maggy", 25));
        students.add(new Student("Ann", 21));
        students.add(new Student("Dan", 18));

        printInput(students);
        searchAge(students);
    }

    public static void printInput(List<Student> students) {
        for (Student value : students) {
            System.out.println("Имя студента: " + value.getAge() + " возраст студента: " + value.getName());
        }
    }
    public static void searchAge(List<Student> students) {
        System.out.println("Введите возраст студента для поиска:");
        Scanner scanner = new Scanner(System.in);
        int ageForSearch = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() == ageForSearch) {
                System.out.println("Сведения о найденном суденте: " + "имя: " + students.get(i).getName() + " возраст: " + students.get(i).getAge());
                break;
            }
        }
    }
}