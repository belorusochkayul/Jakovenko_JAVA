import java.util.Collections;

//поток осуществляет сортировку новостей по возрастанию/убыванию даты
public class ThreadSelectDateSorting extends Thread {

    String dateSorting;
    Root root;

    public ThreadSelectDateSorting(String dateSorting, Root root) {
        this.dateSorting = dateSorting;
        this.root = root;
    }

    @Override
    public void run() {
        switch (dateSorting) {
            case "1": {
                Collections.sort(root.getNews(), new SortByDateAscending());
                break;
            }
            case "2": {
                Collections.sort(root.getNews(), new SortByDateDescending());
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + dateSorting);
        }
        root.getNews();
    }
}