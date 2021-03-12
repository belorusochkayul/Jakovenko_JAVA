
//поток осуществляет парсинг файла, скаченного из интернета
public class ThreadSelectDoParse extends Thread {

    private Root root;
    private ParsingMethodType type;


    public ThreadSelectDoParse(ParsingMethodType type) {
        this.type = type;
    }

    public Root getRoot() {
        return root;
    }

    @Override
    public void run() {
        ParseStratedgy parserStratedgy;
        switch (type) {
            case XML: {
                parserStratedgy = new DomParser(UrlXmlUtils.URL);
                break;
            }
            case JSON: {
                String strToParse = Downloader.load(UrlJsonUtils.URL);
                parserStratedgy = new GsonParser(strToParse);
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        root = parserStratedgy.parse();
        String resultToPrint = "Root " + root.toString();
    }
}