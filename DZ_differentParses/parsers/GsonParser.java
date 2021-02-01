package parsers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;

public class GsonParser implements Variables, ParserStratedgy {

    @Override
    public Root parse() {

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss Z").create();

        try (FileReader reader = new FileReader("currency.json")) {

            Root root = gson.fromJson(reader, Root.class);
            System.out.println("Вы выбрали Gson-парсер");

            return root;

        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}