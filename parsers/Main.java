package parsers;

public class Main {

    public static void main(String[] args) {

        Thread.currentThread().setName("Main thread's working");
        System.out.println(Thread.currentThread().getName());

        ThreadSelectDoParse threadSelectDoParse = new ThreadSelectDoParse();
        threadSelectDoParse.start();

        try {
            threadSelectDoParse.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(threadSelectDoParse.getRoot());


        Tread10Print1 tread10Print1 = new Tread10Print1();
        Thread10Print2 thread10Print2 = new Thread10Print2();

        tread10Print1.start();
        thread10Print2.start();

        try {
            tread10Print1.join();
            thread10Print2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of " + Thread.currentThread().getName());
    }

    public static synchronized void print10() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}