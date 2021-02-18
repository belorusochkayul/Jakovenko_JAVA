package parsers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JacksonParser extends Downloader implements Variables, ParseStratedgy {
    private String stringToParse;

    public JacksonParser(String stringToParse) {
        this.stringToParse = stringToParse;
    }

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Root parse() {
        objectMapper.setDateFormat(df);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        try {
            Root root = objectMapper.readValue(stringToParse, Root.class);
            System.out.println("Вы выбрали Jackson-парсер");
            return root;

        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}