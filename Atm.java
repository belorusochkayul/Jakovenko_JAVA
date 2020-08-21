package by.kiparo.bank;

import java.util.Scanner;

public class Atm {
    private static int byn100;
    private static int byn50;
    private static int byn20;
    static int a, b, c;           // a=100; b=50; c=20;
    static int x, y, z;          // хранят результат целочисленного деления
    static int f, d, e;          //считают новое количество купюр номиналом 100, 50 и 20 соотвествено

    public Atm(int byn100, int byn50, int byn20) {
        this.byn100 = byn100;
        this.byn50 = byn50;
        this.byn20 = byn20;
    }

    public static int entersum() {          //для ввода суммы пользователем
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw / replenish your bank account");
        int sum = sc.nextInt();
        return sum;
    }

    public static void printAtmCash() {             //для распечатки суммы, имеющейся в банкомате/на счете
        System.out.println("Available money: " + "byn100: " + byn100 + "  byn50: " + byn50 + "  byn20: " + byn20);
    }

    public static void addMoney(int sum) {       //для пополнения счета
        boolean atmAnswer;
        if (sum % 10 == 0) {
            atmAnswer = true;
            System.out.println(atmAnswer + " Your deposited money:  " + sum);
            a = 100; b = 50; c = 20;
            f = sum / a;
            x = byn100 + f;
            System.out.println("Number of 100byn:  " + f);
            sum = sum - f * a;
            d = sum / b;
            y = byn50 + d;
            System.out.println("Number of 50byn:  " + d);
            sum = sum - d * b;
            e = sum / c;
            z = byn20 + e;
            System.out.println("Number of 20byn:  " + e);
            System.out.println("Now on your account:  " + "Number of 100byn: " + x + "  Number of 50byn: " + y + "  Number of 20byn: " + z);

        } else {
            atmAnswer = false;
            System.out.println(atmAnswer + "  Wrong nominal!!! Pleas, enter the correct ammount");
        }
    }

    public static void withdrawMoney(int sum) {   // для выдачи денег
        a = 100; b = 50; c = 20;
        if (sum % 10 != 0) {
            System.out.println("Wrong nominal!!! Pleas, enter the correct ammount");

        } else {
            boolean atmAnswer;

            if (byn100 * a + byn50 * b + byn20 * c >= sum) {
                atmAnswer = true;
                System.out.println(atmAnswer + "  Requested amount of money:  " + sum);
                System.out.println("To issue from the account:");
                f = sum / a;
                System.out.println("Number of 100byn:  " + f);
                sum = sum - f * a;
                d = sum / b;
                System.out.println("Number of 50byn:  " + d);
                sum = sum - d * b;
                e = sum / c;
                System.out.println("Number of 20byn:  " + e);

            } else {
                atmAnswer = false;
                System.out.println(atmAnswer + "  Not enough money");
            }
        }
    }
}
