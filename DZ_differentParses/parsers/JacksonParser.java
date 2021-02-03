package parsers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JacksonParser implements Variables, ParserStratedgy{

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Root parse() {
        objectMapper.setDateFormat(df);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        try {
            Root root = objectMapper.readValue(Paths.get("currency.json").toFile(), Root.class);
            System.out.println("Вы выбрали Jackson-парсер");
            return root;

        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return  null;
    }
}