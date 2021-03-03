import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//парсинг xml(json) в зависимотси от выбора пользователя
        String parsingMethod = chooseParse();
        ThreadSelectDoParse threadSelectDoParse = new ThreadSelectDoParse(parsingMethod);
        threadSelectDoParse.start();
        try {
            threadSelectDoParse.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Root root = threadSelectDoParse.getRoot();
        System.out.println(root);                    //результат выбранного парсинга

        System.out.println("Выберите необходимое действие: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("1-отсортировать новости по дате; " +
                "2-осуществить поиск по ключевому слову; " +
                "3-выход");
        int choose = scan.nextInt();
        switch (choose) {
            case 1: {
                String dateSorting = chooseDateSorting();
                ThreadSelectDateSorting threadSelectDateSorting = new ThreadSelectDateSorting(dateSorting, root);
                threadSelectDateSorting.start();
                try {
                    threadSelectDateSorting.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printInput(root.getNews());
                break;
            }
            case 2: {
                TreadSearchByTegValue treadSearchByTegValue = new TreadSearchByTegValue(root);
                treadSearchByTegValue.start();
                try {
                    treadSearchByTegValue.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                System.out.println("Программа завершена");
                break;
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + parsingMethod);
            }
        }
    }

    public static String chooseParse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a parsing method:" + "\n" +
                "1 - DOM parser" + "\n" +
                "2 - GsonParser");
        final String parsingMethod = scanner.next();
        return parsingMethod;
    }

    public static String chooseDateSorting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a sorting types:" + "\n" +
                "1 - SortByDateAscending" + "\n" +
                "2 - SortByDateDescending");
        final String dateSorting = scanner.next();
        return dateSorting;
    }

    public static void printInput(List<News> news) {
        for (News value : news) {
            System.out.println(value);
        }
    }
    public static String tegForSearchInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тег для поиска новости: ");
        String tegForSearch = scan.next();
        return tegForSearch;
    }
}