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
        students.add(new Student("Polly", 19));
        students.add(new Student("Ann", 21));
        students.add(new Student("Dan", 18));

        System.out.println("Имеющийся список студентов: ");
        printInput(students);
        System.out.println("Студенты без дублирования: ");
        removeDublicated(students);

        System.out.println("Выберите вариант сортировки: 1-по возрастанию, 2-по убыванию");
        Scanner scan = new Scanner(System.in);

        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Список студентов, отсортированный по возрастанию возраста: ");
                Collections.sort(students, new SortByAgeAscending());
                printInput(students);
                break;
            }
            case 2: {
                System.out.println("Список студентов, отсортированный по убыванию возраста: ");
                Collections.sort(students, new SortByAgeDescending());
                printInput(students);
                break;
            }
            default: {
                System.out.println("Ваш выбор некорректен,выберите один из двух предложенных вариантов");
                break;
            }
        }
        System.out.println("Введите возраст студента для поиска: ");
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

    public static List<Student> removeDublicated(List<Student> students) {
        HashSet<Student> hashSet = new HashSet<>(students);
        students.clear();
        students.addAll(hashSet);
        printInput(students);
        return students;
    }
}