import java.util.Collections;

//поток осуществляет сортировку новостей по возрастанию/убыванию даты
public class ThreadSelectDateSorting extends Thread {

    DateSortingType dateSorting;
    Root root;

    public ThreadSelectDateSorting(DateSortingType dateSorting, Root root) {
        this.dateSorting = dateSorting;
        this.root = root;
    }
    @Override
    public void run() {
        switch (dateSorting) {
            case ASENDING: {
                Collections.sort(root.getNews(), new SortByDateAscending());
                break;
            }
            case DESCENDING: {
                Collections.sort(root.getNews(), new SortByDateDescending());
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + dateSorting);
        }
        root.getNews();
    }
}