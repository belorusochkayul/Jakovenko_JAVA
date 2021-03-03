import java.util.Scanner;

//в поотоке осуществялет поиск новостей по ключевому слову
public class TreadSearchByTegValue extends Thread {

    public TreadSearchByTegValue(Root root) {
        this.root = root;
    }

    Root root;
    public Root getRoot() {
        return root;
    }

    News news;
    public News getNews() {
        return news;
    }

    @Override
    public void run() {
        String keyWordValue = valueForSearch();
        for (News news : root.getNews()) {
            for (String value : news.getKeywords()) {
                if (value.equals(keyWordValue)) {
                    System.out.println("По ключевому слову: " + value + " результат поиска: " + news);
                }
            }
        }
    }

    private static String valueForSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ключевое слово:");
        String valueForSearch = scan.next();
        return valueForSearch;
    }
}