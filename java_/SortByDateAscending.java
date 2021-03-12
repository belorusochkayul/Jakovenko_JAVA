import java.util.Comparator;

public class SortByDateAscending implements Comparator<News> {

    @Override
    public int compare(News news1, News news2) {
       return news1.getDate().compareTo(news2.getDate());
    }
}