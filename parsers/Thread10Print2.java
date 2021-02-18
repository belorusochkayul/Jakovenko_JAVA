package parsers;

public class Thread10Print2 extends Thread{

    @Override
    public void run() {
        currentThread().setName("second thread");
        for (int i=0;i<10;i++) {
            Main.print10();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
