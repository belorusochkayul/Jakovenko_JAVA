package parsers;

import java.util.Scanner;

public class ThreadSelectDoParse extends Thread {
    Root root;

    public Root getRoot() {
        return root;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a parsing method:" + "\n" +
                "1 - DOM parser" + "\n" +
                "2 - SAX parser" + "\n" +
                "3 - JsonSimpleParser" + "\n" +
                "4 - GsonParser" + "\n" +
                "5 - JacksonParser");
        final String parsingMethod = scanner.next();
        ParseStratedgy parserStratedgy;

        switch (parsingMethod) {
            case "1": {
                parserStratedgy = new DomParser(UrlXmlUtils.URL);
                break;
            }

            case "2": {
                parserStratedgy = new SaxMyParser(UrlXmlUtils.URL);
                break;
            }
            case "3": {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new JsonSimpleParser(strToParse);
                break;
            }
            case "4": {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new GsonParser(strToParse);
                break;
            }
            case "5": {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new JacksonParser(strToParse);
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + parsingMethod);
        }
        root = parserStratedgy.parse();
        String resultToPrint = "Root " + root.toString();
    }
}