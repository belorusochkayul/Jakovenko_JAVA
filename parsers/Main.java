package parsers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Thread.currentThread().setName("Main thread working");
        System.out.println(Thread.currentThread().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a parsing method:" + "\n" +
                "1 - DOM parser" + "\n" +
                "2 - SAX parser" + "\n" +
                "3 - JsonSimpleParser" + "\n" +
                "4 - GsonParser" + "\n" +
                "5 - JacksonParser");
        final String parsingMethod = scanner.next();

        ParserStratedgyString parserStratedgyString;
        ParseStratedgyEmpty parseStratedgyEmpty;

        switch (parsingMethod) {
            case "1": {
                parseStratedgyEmpty = new DomParserString();
                Root root = parseStratedgyEmpty.parse();
                String resultToPrint = "Root " + root.toString();
                break;
            }
            case "2": {
                parseStratedgyEmpty = new SaxMyParser();
                Root root = parseStratedgyEmpty.parse();
                String resultToPrint = "Root " + root.toString();
                break;
            }
            case "3": {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgyString = new JsonSimpleParser();
                Root root = parserStratedgyString.parse(strToParse);
                String resultToPrint = "Root " + root.toString();
                break;
            }
            case "4": {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgyString = new GsonParser();
                Root root = parserStratedgyString.parse(strToParse);
                String resultToPrint = "Root " + root.toString();
                break;
            }
            case "5": {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgyString = new JacksonParser();
                Root root = parserStratedgyString.parse(strToParse);
                String resultToPrint = "Root " + root.toString();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + parsingMethod);
        }
        System.out.println(resultToPrint); 
    }



 //        downloadThread.start();
//
//        try {
//            downloadThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Root " + root.toString());
//        System.out.println("End of " + Thread.currentThread().getName());
//
//        Tread10Print1 tread10Print1 = new Tread10Print1();
//        Thread10Print2 thread10Print2 = new Thread10Print2();
//
//        tread10Print1.start();
//        thread10Print2.start();
//
//        try {
//            tread10Print1.join();
//            thread10Print2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }





    public static synchronized void print10() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}