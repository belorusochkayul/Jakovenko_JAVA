package parsers;

public class Tread10Print1 extends Thread {

    @Override
    public void run() {
        currentThread().setName("first thread");
        for (int i = 0; i < 10; i++) {
            Main.print10();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}