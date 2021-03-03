import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonParser extends Downloader implements ParseStratedgy {
    final String pattern = "yyyy-MM-dd HH:mm:ss Z";
    private String stringToParse;

    public GsonParser(String stringToParse) {
        this.stringToParse = stringToParse;
    }

    public Root parse() {
        Gson gson = new GsonBuilder().setDateFormat(pattern).create();

        try {
            Root root = gson.fromJson(stringToParse, Root.class);
            System.out.println("Вы выбрали Gson-парсер");
            return root;

        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}