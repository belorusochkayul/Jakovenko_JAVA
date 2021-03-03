
//поток осуществляет парсинг файла, скаченного из интернета
public class ThreadSelectDoParse extends Thread {

    String parsingMethod;
    public ThreadSelectDoParse(String parsingMethod) {
        this.parsingMethod = parsingMethod;
    }

    Root root;
    public Root getRoot() {
        return root;
    }

    @Override
    public void run() {
        ParseStratedgy parserStratedgy;
        switch (parsingMethod) {
            case "1": {
                parserStratedgy = new DomParser(UrlXmlUtils.URL);
                break;
            }
            case "2": {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new GsonParser(strToParse);
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + parsingMethod);
        }
        root = parserStratedgy.parse();
        String resultToPrint = "Root " + root.toString();
    }
}