import java.util.Comparator;

public class SortByAgeDescending implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() < student2.getAge()) {
            return 1;
        }
        if (student1.getAge() == student2.getAge()) {
            return 0;
        }
        return -1;
    }
}