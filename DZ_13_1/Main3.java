import java.util.*;

public class Main3 {

    public static void main(String[] arg) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Maggy", 25));
        students.add(new Student("Maggy", 25));
        students.add(new Student("Ann", 21));
        students.add(new Student("Dan", 18));
        students.add(new Student("Maggy", 25));
        students.add(new Student("Dan", 18));
        students.add(new Student("Ann", 21));
        students.add(new Student("Dan", 18));

        printInput(students);

        System.out.println("Студенты без дублирования: ");
        List<Student> nonDublicateStudents = new ArrayList<>(new HashSet<>(students));
        printInput(nonDublicateStudents);

        System.out.println("Введите возраст студента для поиска: ");
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
            System.out.println("Имя студента: " + value.getName() + " возраст студента: " + value.getAge());
        }
    }
}