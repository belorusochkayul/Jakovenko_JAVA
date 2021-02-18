package parsers;

public class Thread10Print2 extends Thread{
    Root root;
    // get
    @Override
    public void run() {
        currentThread().setName("second thread");
        for (int i=0;i<10;i++) {
            Main.print10();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            // root = parserStratedgy.parse(strToParse);
        }
    }
}
