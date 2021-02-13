package parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaxParserHandler extends DefaultHandler implements Variables {

    private Root root = new Root();
    List<Currency> currencyList = new ArrayList<>();
    private String currentTagName;
    private boolean isCurrent = false;
    private boolean isElement = false;

    private int code;
    private int id;
    private String name;
    private float rate;
    private boolean visible;
    private Date date;

    public Root getRoot() {
        return root;
    }

    @Override
    public void startDocument() throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {
        root.setCurrencies(currencyList);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTagName = qName;
        if (currentTagName.equals(TAG_CURRENCY)) {
            isCurrent = true;
        } else if (currentTagName.equals(TAG_ELEMENT)) {
            isCurrent = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals(TAG_CURRENCY)) {
            isCurrent = false;
        } else if (qName.equals(TAG_ELEMENT)) {
            isElement = false;

            Currency currency = new Currency(code, id, name, rate, visible);
            currencyList.add(currency);
        }
        currentTagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (currentTagName == null) {
            return;
        } else if (!isCurrent) {
            switch (currentTagName) {
                case TAG_BANK_NAME: {
                    root.setBankName(new String(ch, start, length));
                    break;
                }
                case TAG_BANK_LOCATION: {
                    root.setBankLocation(new String(ch, start, length));
                    break;
                }
                case TAG_DATE: {
                    DateParse dateParse = new DateParse();
                    dateParse.strToDate(new String(ch, start, length));
                    date = dateParse.strToDate(new String(ch, start, length));
                    root.setDate(date);
                    break;
                }
                case TAG_BASE_CURRENCY_ID: {
                    root.setBaseCurrencyId(Integer.valueOf(new String(ch, start, length)));
                    break;
                }
            }
        }

        if (isCurrent && isElement) {
        }
        switch (currentTagName) {
            case TAG_CODE: {
                try {
                    code = Integer.valueOf(new String(ch, start, length));
                    break;
                } catch (Exception e) {
                    System.out.println("Type not Int" + e.toString());
                }
            }
            case TAG_ID: {
                try {
                    id = Integer.valueOf(new String(ch, start, length));
                    break;
                } catch (Exception e) {
                    System.out.println("Type not Int" + e.toString());
                }
            }
            case TAG_NAME: {
                name = new String(ch, start, length);
                break;
            }
            case TAG_RATE: {
                try {
                    rate = Float.valueOf(new String(ch, start, length));
                    break;
                } catch (Exception e) {
                    System.out.println("Type not Float" + e.toString());
                }
            }
            case TAG_VISIBLE: {
                visible = Boolean.valueOf(new String(ch, start, length));
                break;
            }
        }
    }
}