import java.util.List;
import java.util.Scanner;

public class main {
    private static final String XML = "1";
    private static final String JSON = "2";

    public static void main(String[] args) {

        //парсинг xml(json) в зависимости от выбора пользователя
        ParsingMethodType type = null;
        DateSortingType dateSorting = null;
        UsersOptions usersOptions = null;

        int parsingMethod = chooseParse();
        if (parsingMethod == 1) {
            type = ParsingMethodType.XML;
        } else {
            if (parsingMethod == 2) {
                type = ParsingMethodType.JSON;
            }
        }
        ThreadSelectDoParse threadSelectDoParse = new ThreadSelectDoParse(type);
        threadSelectDoParse.start();
        try {
            threadSelectDoParse.join();
        } catch (InterruptedException e) {
        }

        Root root = threadSelectDoParse.getRoot();
        System.out.println(root);                    //результат выбранного парсинга

        System.out.println("Выберите необходимое действие: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("1-" + UsersOptions.SORT_BY_DATE.toString() +
                "  2-" + UsersOptions.SEARCH_BY_KEYWORD.toString() +
                "  3-" + UsersOptions.EXIT.toString());
        int choose = scan.nextInt();
        if (choose == 1) {
            usersOptions = UsersOptions.SORT_BY_DATE;
        }
        if (choose == 2) {
            usersOptions = UsersOptions.SEARCH_BY_KEYWORD;
        }
        if (choose == 3) {
            usersOptions = UsersOptions.EXIT;
        }
        switch (usersOptions) {
            case SORT_BY_DATE: {
                int dateSortingChoose = chooseDateSorting();
                if (dateSortingChoose == 1) {
                    dateSorting = DateSortingType.ASENDING;
                } else {
                    if (dateSortingChoose == 2) {
                        dateSorting = DateSortingType.DESCENDING;
                    }
                }
                ThreadSelectDateSorting threadSelectDateSorting = new ThreadSelectDateSorting(dateSorting, root);
                threadSelectDateSorting.start();
                try {
                    threadSelectDateSorting.join();
                } catch (InterruptedException e) {
                }
                printInput(root.getNews());
                break;
            }
            case SEARCH_BY_KEYWORD: {
                TreadSearchByTegValue treadSearchByTegValue = new TreadSearchByTegValue(root);
                treadSearchByTegValue.start();
                try {
                    treadSearchByTegValue.join();
                } catch (InterruptedException e) {
                }
                break;
            }
            case EXIT: {
                System.out.println("Программа завершена");
                break;
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + parsingMethod);
            }
        }
    }

    public static int chooseParse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a parsing method:" + "\n" +
                "1-" + ParsingMethodType.XML.toString() + "\n" +
                "2-" + ParsingMethodType.JSON.toString());
        final int parsingMethod = scanner.nextInt();
        return parsingMethod;
    }

    public static int chooseDateSorting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a sorting types:" + "\n" +
                "1-" + DateSortingType.ASENDING.toString() + "\n" +
                "2-" + DateSortingType.DESCENDING.toString());
        final int dateSorting = scanner.nextInt();
        return dateSorting;
    }

    public static void printInput(List<News> news) {
        for (News value : news) {
            System.out.println(value);
        }
    }
}