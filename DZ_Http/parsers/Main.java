package parsers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ParserStratedgy parserStratedgy;
        DownloadStratedgy downloadStratedgy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a parsing method:" + "\n" +
                "1 - DOM parser" + "\n" +
                "2 - SAX parser" + "\n" +
                "3 - JsonSimpleParser" + "\n" +
                "4 - GsonParser" + "\n" +
                "5 - JacksonParser");
        String parsingMethod = scanner.next();

        switch (parsingMethod) {
            case "1": {
                parserStratedgy = new DomParser();
                downloadStratedgy = new DomParser();
                break;
            }
            case "2": {
                parserStratedgy = new SaxMyParser();
                downloadStratedgy = new SaxMyParser();
                break;
            }
            case "3": {
                parserStratedgy = new JsonSimpleParser();
                downloadStratedgy = new JsonSimpleParser();
                break;
            }
            case "4": {
                parserStratedgy = new GsonParser();
                downloadStratedgy = new GsonParser();
                break;
            }
            case "5": {
                parserStratedgy = new JacksonParser();
                downloadStratedgy = new JacksonParser();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + parsingMethod);
        }
        Root root = parserStratedgy.parse(downloadStratedgy.load());
        System.out.println("Root " + root.toString());
    }
}