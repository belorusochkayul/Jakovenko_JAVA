package parsing;

import parsing.model.SaxMyParser;

import java.util.Scanner;

public class Main {

    private static ParserStrategy parserStrategy;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a parsing method:" + "\n" +
                "1 - DOM parser" + "\n" +
                "2 - SAX parser");
        String parsingMethod = scanner.next();

        if (parsingMethod.equals("1")) {
            parserStrategy = new DomParser();
        } else {
            parserStrategy = new SaxMyParser();
        }

        Root root = parserStrategy.parse();
        System.out.println("Root " + root.toString());
    }
}