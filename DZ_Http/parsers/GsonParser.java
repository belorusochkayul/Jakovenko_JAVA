package parsers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonParser extends Downloader implements Variables, ParserStratedgy {

    @Override
    public Root parse(String stringToParse) {

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss Z").create();

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