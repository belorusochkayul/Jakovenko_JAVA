
import java.util.Scanner;

public class Atm {
    private int byn100;
    private int byn50;
    private int byn20;

    public Atm(int byn100, int byn50, int byn20) {
        this.byn100 = byn100;
        this.byn50 = byn50;
        this.byn20 = byn20;
    }

    public int getByn100() {
        return byn100;
    }

    public int getByn50() {
        return byn50;
    }

    public int getByn20() {
        return byn20;
    }

    public boolean addMoney(int sum) {

        boolean atmAnswer;
        int wholePartDivid100, wholePartDivid50, wholePartDivid20;
        int quantityByn100, quantityByn50, quantityByn20;

        if (sum % 10 == 0) {
            atmAnswer = true;
            System.out.println(atmAnswer);
            wholePartDivid100 = sum / 100;
            quantityByn100 = byn100 + wholePartDivid100;
            System.out.println("Number of 100byn:  " + wholePartDivid100);

            sum = sum - wholePartDivid100 * 100;
            wholePartDivid50 = sum / 50;
            quantityByn50 = byn50 + wholePartDivid50;
            System.out.println("Number of 50byn:  " + wholePartDivid50);

            sum = sum - wholePartDivid50 * 50;
            wholePartDivid20 = sum / 20;
            quantityByn20 = byn20 + wholePartDivid20;
            System.out.println("Number of 20byn:  " + wholePartDivid20);
            System.out.println("Now on your account:  " + "Number of 100byn: " + quantityByn100 + "  Number of 50byn: " + quantityByn50 + "  Number of 20byn: " + quantityByn20);

        } else {
            atmAnswer = false;
            System.out.println(atmAnswer);
        }
        return atmAnswer;
    }

    public boolean withdrawMoney(int sum) {
        int wholePartDivid100, wholePartDivid50, wholePartDivid20;
        boolean atmAnswer;

        if (getByn100() * 100 + getByn50() * 50 + getByn20() * 20 >= sum && sum % 10 == 0) {
            atmAnswer = true;
            System.out.println(atmAnswer + "  Requested amount of money:  " + sum);
            System.out.println("To issue from the account:");
            wholePartDivid100 = sum / 100;
            System.out.println("Number of 100byn:  " + wholePartDivid100);

            sum = sum - wholePartDivid100 * 100;
            wholePartDivid50 = sum / 50;
            System.out.println("Number of 50byn:  " + wholePartDivid50);

            sum = sum - wholePartDivid50 * 50;
            wholePartDivid20 = sum / 20;
            System.out.println("Number of 20byn:  " + wholePartDivid20);

        } else {
            atmAnswer = false;
            System.out.println(atmAnswer + "  Not enough money enter the correct sum");
        }
        return atmAnswer;
    }
}