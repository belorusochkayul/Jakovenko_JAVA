package parsers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ParserStratedgy parserStratedgy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a parsing method:" + "\n" +
                "1 - DOM parser" + "\n" +
                "2 - SAX parser" + "\n" +
                "3 - JsonSimpleParser" + "\n" +
                "4 - GsonParser" + "\n" +
                "5 - JacksonParser");
        String parsingMethod = scanner.next();

        Downloader downloader = new Downloader();
        String strToParse = null;

        switch (parsingMethod) {
            case "1": {
                //strToParse = downloader.load(UrlXmlUtils.URL);
                parserStratedgy = new DomParser();
                break;
            }
            case "2": {
                //strToParse = downloader.load(UrlXmlUtils.URL);
                parserStratedgy = new SaxMyParser();
                break;
            }
            case "3": {
                strToParse = downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new JsonSimpleParser();
                break;
            }
            case "4": {
                strToParse = downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new GsonParser();
                break;
            }
            case "5": {
                strToParse = downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new JacksonParser();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + parsingMethod);
        }
        Root root = parserStratedgy.parse(strToParse);
        System.out.println("Root " + root.toString());
    }
}