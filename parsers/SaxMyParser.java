package parsers;

import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxMyParser implements ParseStratedgy {

    private String url;

    public SaxMyParser(String url) {
        this.url = url;
    }

    @Override
    public Root parse() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;

        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.out.println("Open sax parser error" + e.toString());
            return null;
        }

        try {
            parser.parse(url, handler);
        } catch (SAXException e) {
            System.out.println("Sax parsing error" + e.toString());
            return null;
        } catch (IOException e) {
            System.out.println("IO parsing error" + e.toString());
            return null;
        }
        System.out.println("Вы выбрали SAX-парсер");
        return handler.getRoot();
    }
}