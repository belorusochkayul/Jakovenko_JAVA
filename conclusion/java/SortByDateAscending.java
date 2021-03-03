import java.util.Comparator;

public class SortByDateAscending implements Comparator<News> {

    @Override
    public int compare(News news1, News news2) {
        if (news1.getDate().compareTo(news2.getDate())<0) {
            return -1;
        }
        if (news1.getDate().compareTo(news2.getDate())==0) {
            return 0;
        }
        return 1;
    }
}