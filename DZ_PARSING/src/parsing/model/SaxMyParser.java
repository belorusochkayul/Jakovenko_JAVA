package parsing.model;

import org.xml.sax.SAXException;
import parsing.ParserStrategy;
import parsing.Root;
import parsing.SaxParserHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxMyParser implements ParserStrategy {

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

        File file = new File("currency.xml");
        try {
            parser.parse(file, handler);
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